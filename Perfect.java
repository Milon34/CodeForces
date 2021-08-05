package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Perfect {
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
    public static String addChar(String str, char ch, int position) {
        return str.substring(0, position) + ch + str.substring(position);
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            boolean check = true;
            int flag = 0;
            for (int i = 0; i < s.length(); i++) {
                String concat = addChar(s, 'a', i);
                StringBuffer sb = new StringBuffer(concat);
                String myS = String.valueOf(sb.reverse());
                if (concat.equals(myS)) {
                    check = false;
                } else {
                    System.out.println("YES");
                    System.out.println(concat);
                    flag = 1;
                    break;
                }
            }
            if (!check && flag == 0) {
                System.out.println("NO");
            }
        }
    }
}
