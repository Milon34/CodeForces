package Contest_Practice.div2_673;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int mn=0;
            for (int i=1;i<n;i++){
                if (arr[i]<arr[mn]){
                    mn=i;
                }
            }
            int ans=0;
            for (int i=0;i<n;i++){
                if (i !=mn){
                    ans +=(k-arr[i])/arr[mn];
                }
            }
            System.out.println(ans);
        }
    }
}
