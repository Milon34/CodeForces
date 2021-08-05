package Codeforces.Educational_Codeforces_Round_112;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int W, H;
            W = sc.nextInt();
            H = sc.nextInt();
            int x1, y1, x2, y2;
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            int w, h;
            w = sc.nextInt();
            h = sc.nextInt();
            int a, b;
            int dif1,dif2;
            a = x1;
            b = y1;
            dif1= W - x2;
            dif2 = H - y2;
            double mn = Double.MAX_VALUE;
            if (w <= a + dif1) {
                if (h <= b + dif2) {
                    if (mn - (w - Math.max(a, dif1)) > 1e-8) {
                        mn = w - Math.max(a, dif1);
                    }
                    if (mn - (h - Math.max(b, dif2)) > 1e-8) {
                        mn = h - Math.max(b, dif2);
                    }
                    if (mn - Math.hypot(1.0 * (w - Math.max(a, dif1)), 1.0 * (h - Math.max(b, dif2)))> 1e-8) {
                        mn = Math.hypot(1.0 * (w - Math.max(a, dif1)), 1.0 * (h - Math.max(b, dif2)));
                    }
                } else {
                    if (mn - (w - Math.max(a, dif1)) > 1e-8) {
                        mn = w - Math.max(a, dif1);
                    }
                }
            } else {
                if (h <= b + dif2) {
                    if (mn - (h - Math.max(b, dif2)) > 1e-8) {
                        mn = h - Math.max(b, dif2);
                    }
                } else {
                    mn = -1;
                }
            }
            System.out.printf("%.9f\n", mn);
        }
    }
}
