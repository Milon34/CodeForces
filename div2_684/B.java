package Contest_Practice.div2_684;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long n,k;
            n=sc.nextLong();
            k=sc.nextLong();
            long arr[]=new long[Math.toIntExact((n * k))];
            int fVal = (int) (n/2 + 1);
            for(int i=0;i<n*k;i++){
                arr[i]=sc.nextLong();
            }
            long ans = 0;
            for(long i = n*k-fVal; i>=k*(n-fVal); i=i-fVal){
                ans+=arr[(int) i];
            }
            System.out.println(ans);
        }
    }
}
