package Codeforces;

import java.util.Scanner;

public class Grade_Allocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n,m;
            n=sc.nextInt();
            m=sc.nextInt();
            int sum=0;
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                sum+=a;
            }
            System.out.println(Math.min(m,sum));
        }
    }
}
