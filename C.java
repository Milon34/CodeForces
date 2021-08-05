package Codeforces;


import java.util.Scanner;

public class C {
    static int lcs(String str1, String str2, int m, int n) {
        int L[][] = new int[m + 1][n + 1];
        int i, j;
        for (i = 0; i <= m; i++) {
            for (j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;
                else
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
            }
        }
        return L[m][n];
    }
    static void sol(String str1, String str2,int res) {
        int m = str1.length();
        int n = str2.length();
        int len = lcs(str1, str2, m, n);
        System.out.println((m + n) - (2 * res));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            int  res = 0;
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    for (int k = 0; k < Math.min(s1.length() - i, s2.length() - j); k++) {
                        if (s1.charAt(i + k) != s2.charAt(j + k)) {
                            break;
                        } else {
                            res = Math.max(res, k + 1);
                        }
                    }
                }
            }
           sol(s1,s2,res);
        }

    }
}
