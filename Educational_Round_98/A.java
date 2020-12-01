package Contest_Practice.Educational_Round_98;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            int count = 0;
//            if (a == b) {
//                System.out.println(a + b);
//
//            }
            if (a < b) {
                System.out.println(2*b-1);

            }else if (a>b){
                System.out.println(2*a-1);
            }else {
                System.out.println(a+b);
            }


        }
    }
}
