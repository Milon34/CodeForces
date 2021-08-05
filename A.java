package Codeforces;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n, m, x;
            n = sc.nextLong();
            m = sc.nextLong();
            x = sc.nextLong();
            long res, row, var, dif, difRes, coVal, ans, val;
            res = x % n;
            if (res == 0) {
                res = n;
            }
            row = (res - 1) * m;
            var = n - res;
            val = (n * m) - var;
            dif = val - x;
            difRes = dif / n;
            coVal = m - difRes;
            ans = row + coVal;
            System.out.println(ans);
        }
    }
}

