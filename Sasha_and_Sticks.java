package Codeforces;

import java.util.Scanner;

public class Sasha_and_Sticks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n,k;
        n=sc.nextLong();
        k=sc.nextLong();
        if ((n/k)%2!=0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
