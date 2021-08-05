package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class I_Hate_1111 {
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

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n>=(n%11)*111){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
//            String val = String.valueOf(n / 10);
//            String per = "";
//            for (int i = 0; i < val.length() + 2; i++) {
//                per += '1';
//            }
//            int my = Integer.parseInt(per);
//            System.out.println(my);
//            long pros = my - n;
//            if (pros % 11 == 0) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//
        }
    }
}
