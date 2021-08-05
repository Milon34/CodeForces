package Codeforces;

import java.util.Scanner;

public class Ternary_Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            int x,y,z;
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
//            if (Math.min(c,y)*2==0){
//                if (b>=x) {
//                    System.out.println(-Math.min(b - x, z) * 2);
//                }else {
//                    System.out.println(0);
//                }
//            }else {
//                System.out.println(Math.min(c,y)*2);
//            }
            int m;
            m = Math.min(a, z);
            a -= m;
            z -= m;
            m = Math.min(b, x);
            b -= m;
            x -= m;
            m = Math.min(c, y);
            c -= m;
            y -= m;
            int sum = 2 * m;
            sum-=2*Math.min(b,z);
            System.out.println(sum);
        }
    }
}
