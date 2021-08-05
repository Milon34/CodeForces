package Codeforces;

import java.util.Scanner;

public class GameSol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if (a>b){
            System.out.println("First");
        }else {
            System.out.println("Second");
        }
    }
}
