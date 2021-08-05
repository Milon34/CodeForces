package Codeforces;

import java.util.Scanner;

public class Odd_Set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int count=0;
            for (int i=0;i<2*n;i++){
                int a=sc.nextInt();
                if (a%2!=0){
                    count++;
                }
            }
            if (count==n){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
