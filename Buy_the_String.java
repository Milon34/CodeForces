package Codeforces;

import java.util.Scanner;

public class Buy_the_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, a, b, c;
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            String s = sc.next();
            int count1 = 0, count0 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
            if (a < b) {
                System.out.println(Math.min(count0*a+count1*b,(n*a)+(count1*c)));
            } else {
                System.out.println(Math.min(count1*b+count0*a,(n*b)+(count0*c)));

            }
        }
    }
}
