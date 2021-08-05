package Codeforces;

import java.util.Scanner;

public class Ordinary_Numbers {
    static long count(long L, long R) {
        long t = 0, ans = 0;
        long n = (long) Math.log10(R) + 1;
        for (int i = 0; i < n; i++) {
            t = t * 10 + 1;
            for (int j = 1; j <= 9; j++) {
                if (L <= (t * j) && (t * j) <= R) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();

            System.out.println(count(1, n));
        }
    }
}

