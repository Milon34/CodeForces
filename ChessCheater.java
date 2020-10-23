package Contest_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ChessCheater {
    static int d[] = new int[1000009];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int ii = 0; ii < t; ii++) {
            int ld = 0;
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            char s[] = scanner.next().toCharArray();
            int l = -1, r = 0, ans = 0;
            int pre = 0;
            for (int i = 0; i < n; i++) {
                if (s[i] == 'W' && l == -1) {
                    l = i;
                }
                if (s[i] == 'W') {
                    r = i;
                    if (i > 0 && s[i - 1] == 'W')
                        ans += 2;  //
                    else
                        ans++;
                }
            }
            if (l == -1) {
                if (n == 1) {
                    if (k != 0) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                } else {
                    int op = 0;
                    ans = Math.max(op, (Math.min(n, k) - 1) * 2 + 1);
                    System.out.println(ans);
                }
                continue;
            }
            for (int i = l; i <= r; i++) {
                int pos = i;
                if (s[pos] == 'L') {
                    while (s[pos] == 'L')
                        pos++;
                    d[++ld] = pos - i;

                    i = pos - 1;
                }
            }
            Arrays.sort(d, 1, 1 + ld);
            for (int i = 1; i <= ld; i++) {
                if (k >= d[i]) {
                    ans = ans + ((d[i] * 2) + 1);
                    k -= d[i];
                } else {
                    if (k != 0) {
                        ans = ans + (k * 2);
                        k = 0;
                    }
                    break;
                }
            }

            int re = Math.min(k, n - r - 1 + l);
            System.out.println(ans + re * 2);
        }
    }
}