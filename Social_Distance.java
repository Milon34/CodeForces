package Codeforces;

import java.util.Scanner;

public class Social_Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            String s = sc.next();
            char[] ch = s.toCharArray();
            int val1 = -k - 1, res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (ch[i] == '0') {
                    if (i - val1 > k) {
                        res++;
                        ch[i] = '1';
                        val1 = i;
                    }
                } else if (ch[i] == '1') {
                    if (i - val1 <= k) {
                        ch[val1] = '0';
                        res--;
                    }
                    val1 = i;
                }
            }
            System.out.println(res);
        }
    }
}
