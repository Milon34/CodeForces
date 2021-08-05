package Codeforces;

import java.util.Scanner;

public class FenceSol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a,b,c;
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            System.out.println(Math.max(a,Math.max(b,c))+1);

        }
        System.out.println(1<<18);
        //System.out.println(Integer.toBinaryString(262144));
    }
}
