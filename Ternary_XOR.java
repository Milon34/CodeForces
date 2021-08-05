package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ternary_XOR {
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
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char ch1[] = new char[n];
            char ch2[] = new char[n];
            Arrays.fill(ch1,'0');
            Arrays.fill(ch2,'0');
            for (int i = 0; i <n; i++) {
                if (s.charAt(i) == '0') {
                    ch1[i] = '0';
                    ch2[i] = '0';
                }
                if (s.charAt(i) == '1') {
                    ch1[i] = '1';
                    ch2[i] = '0';
                    for (int j = i + 1; j < n; j++) {
                        ch2[j] = s.charAt(j);
                    }
                    break;
                }
                if (s.charAt(i) == '2') {
                    ch1[i] = '1';
                    ch2[i] = '1';
                }
            }
//            System.out.println(Arrays.toString(ch1));
//            System.out.println(Arrays.toString(ch2));
//            System.out.println(ch1.length);
//            System.out.println(ch2.length);
            for (int i=0;i<ch1.length;i++){
                System.out.print(ch1[i]);
            }
            System.out.println();
            for (int i=0;i<ch2.length;i++){
                System.out.print(ch2[i]);
            }
            System.out.println();
//            for (char ch : ch1) {
//                System.out.print(ch);
//            }
//            System.out.println();
//            for (char ch : ch2) {
//                System.out.print(ch);
//            }
        }
    }
}
