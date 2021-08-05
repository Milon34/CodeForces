package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Canine_poetry {
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

    //    public static List<Character> convert(String str) {
//        List<Character> ch = str
//                .chars()
//                .mapToObj(e -> (char) e)
//                .collect(Collectors.toList());
//        return ch;
//    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            //    char[] ch =s.toCharArray();
            int n = s.length();
//            List<Character> l = new ArrayList<>();
//            l = convert(s);
//            l.add('.');
//            Collections.reverse(l);
            char[] ch = new char[n + 1];
            for (int i = 1; i <= n; i++) {
                ch[i] = s.charAt(i - 1);
            }
            boolean[] used = new boolean[n + 1];
            Arrays.fill(used, false);
            int res = 0;
            for (int i = 2; i <= n; i++) {
                boolean ok = false;
                if (ch[i] == ch[i-1] && !used[i - 1]) {
                    ok = true;
                }
                if (i > 2 && ch[i]==ch[i-2]&& !used[i - 2]) {
                    ok = true;
                }
                used[i] = ok;
                if (used[i]) {
                    res++;
                }
            }
            out.println(res);
        }
        out.flush();
        out.close();
    }
}
