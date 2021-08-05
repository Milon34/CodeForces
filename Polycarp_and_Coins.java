package Codeforces;

import java.util.Scanner;

public class Polycarp_and_Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            if (n%3==0){
                System.out.println(n/3+" "+n/3);
            }else if (n%3==1){
                System.out.println((n/3)+1+" "+n/3);
            }else {
                System.out.println(n/3+" "+((n/3)+1));
            }
        }
    }
}
