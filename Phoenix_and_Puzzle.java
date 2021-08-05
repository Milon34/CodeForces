package Codeforces;

import java.util.Scanner;

public class Phoenix_and_Puzzle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            if (n==2){
                System.out.println("YES");
            }else {
                if (n%4== 0) {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }
}
