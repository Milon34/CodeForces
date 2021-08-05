package Codeforces;

import java.util.Scanner;
import java.util.Vector;

public class D {
    static long gcd(long n1, long n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }

    static long MAXN = 100005;
    static Vector<Long> v = new Vector<>();

    public static long func(long c) {
        long ct = 0;

        for (long i : v) {
            while (c % i == 0) {
                c /= i;
                ct++;
            }
        }
        if (c!=1){
            ct++;
        }
//        ct+=c!=1;
        return ct;
    }

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            long t;
            long[] spf = new long[(int) MAXN];
            t = sc.nextLong();
            for (long i = 0; i < MAXN; i++)
                spf[(int) i] = 1;
            spf[0] = 0;
            spf[1] = 0;
            for (long i = 2; i < MAXN; i++) {
                if (spf[(int) i] == 1) {
                    v.add(i);
                    for (long j = 2 * i; j < MAXN; j += i)
                        spf[(int) j] = 0;
                }
            }
            while (t-- > 0) {
                long a, b, k;
                a = sc.nextLong();
                b = sc.nextLong();
                k = sc.nextLong();
                if (a == b && k == 1) {
                    System.out.println("No");
                    continue;
                }
                if (a != b && k == 0) {
                    System.out.println("No");
                    continue;
                }
                long c = gcd(a, b);
                long c1 = a / c, c2 = b / c;
                long minn = 0;
                long maxx = 0;
                if (c1 != 1)
                    minn++;
                if (c2 != 1)
                    minn++;
                maxx += func(a) + func(b);
                if (minn <= k && k <= maxx)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }

        }
    }
}
