package Contest_Practice.Educational_Round_97;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            int l, r,finalValue;
            l = sc.nextInt();
            r = sc.nextInt();
             //finalValue=r+1;
//            System.out.println(l%r);
//            System.out.println(l/r);

           if (l>=(r+2)/2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
