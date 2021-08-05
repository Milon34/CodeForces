package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pangram {
    static class RealScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
    public static boolean checkPangram(String str) {
        boolean[] mark = new boolean[26];
        int idx = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                idx = str.charAt(i) - 'A';
            }
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                idx = str.charAt(i) - 'a';
            }
            mark[idx] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (!mark[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int n = sc.nextInt();
        int countUpper = 0, countLower = 0;
        String s = sc.next();
//        for (int i = 0; i < s.length(); i++) {
//            if (Character.isUpperCase(s.charAt(i))) {
//                countUpper++;
//            } else {
//                countLower++;
//            }
//        }
//        if (countUpper == n || countLower == n) {
//            System.out.println("NO");
//        } else {
//            System.out.println("YES");
//        }
        if (checkPangram(s)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
