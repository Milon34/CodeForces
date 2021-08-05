package Codeforces;

import java.util.Scanner;

public class Array_Cancellation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextInt();
            long res=0;
            for (int i=0;i<n;i++){
                long x=sc.nextLong();
                res= Math.max(0,res+x);
            }
            System.out.println(res);
        }

    }
}
