package Contest_Practice.div2_680;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        while (tt-- >0){
            int a,b,c,d;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            System.out.println(Math.max(a+b,d+c));
        }
    }
}
