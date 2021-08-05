package Codeforces;

import java.util.Scanner;

public class Plus_and_Multiply {
    public static double Log2(long x, long a) {
        return Math.log10(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a, b, n;
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            int n1 = n;
            int n2 = n;
            boolean flag = false;
            while (n1 > 0) {
                if (Math.ceil(Log2(n1, a)) == Math.floor(Log2(n1, a))) {
                    flag = true;
                    break;
                }
                if (n1 - b == 1) {
                    flag = true;
                    break;
                }
                n1 = n1 / a;
            }
            while (n2 > 0) {
                if (Math.ceil(Log2(n2, a)) == Math.floor(Log2(n2, a))) {
                    flag = true;
                    break;
                }
                if (n2 - b == 1) {
                    flag = true;
                    break;
                }
                n2 = n2 -b;
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
