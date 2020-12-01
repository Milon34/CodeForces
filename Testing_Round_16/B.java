package Contest_Practice.Testing_Round_16;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while ( t-- >0){
            int a1,b1,a2,b2;
            a1=sc.nextInt();b1=sc.nextInt();
            a2=sc.nextInt();b2=sc.nextInt();
            if ((a1==a2&&b1+b2==a1)||(a1==b2&&b1+a2==a1)||(b1==a2&&a1+b2==b1)||(b1==b2&&a1+a2==b1)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
