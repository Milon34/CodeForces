package Contest_Practice.div2_670;

import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n;
            n=sc.nextInt();
            int arr[]=new int[101];
            int a=2,b;
            for (int i=0;i<n;i++){
                b=sc.nextInt();
                arr[b]++;
            }
            int ans=0,i=0;
            while (i<101 &&a>0){
                if (arr[i]<a){
                    a--;
                    ans=ans+i;
                }else {
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}

