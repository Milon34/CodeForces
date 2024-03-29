package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Vova_and_Train {
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
        int n = sc.nextInt();
        while (n-- > 0) {
            int a, b, c, d;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            int divVal=a/b;
            int fast=(c-1)/b;
            int preFast=d/b;
            System.out.println(divVal-(preFast-fast));
//            int count = 0;
//            if (b==c&&a==d){
//                System.out.println(0);
//            }else {
//                for (int i = b; i <= a; i += b) {
//                    if (i < c || i > d) {
//                        count++;
//                    }
//                }
//                System.out.println(count);
//            }
        }
    }
}
