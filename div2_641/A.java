package Contest_Practice.div2_641;

import java.util.Scanner;

public class A {
    public static int findTheSmallestDivisor(int n) {
        int result;
        if ((n % 2) != 0) {
            int r = (int) Math.sqrt(n);
            int d = 3;
            while ((n % d) != 0 && d < r) {
                d = d + 2;
            }
            if (n % d == 0) {
                result = d;
            } else {
                result = 1;
            }
        } else {
            result = 2;
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            int value = n;
            if (n % 2 == 0) {
                System.out.println(n + (2 * k));
            } else {
                for (int i = 2; i <= value; i++) {
                    if (value % i == 0) {
                        value = i;
                        break;
                    }
                }
                System.out.println(n + (2 * (k - 1)) + value);
            }
        }
    }
}