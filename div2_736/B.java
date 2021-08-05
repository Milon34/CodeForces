package Codeforces.div2_736;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B {
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
            int n;
            n = sc.nextInt();
            char[][] arr = new char[2][n];
            int res = 0;
            for (int i = 0; i < 2; i++) {
                String s = sc.next();
                for (int j = 0; j < n; j++) {
                    arr[i][j] = s.charAt(j);
                }
            }
//            for (int i = 0; i < 2; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(a[i][j] + " ");
//                }
//                System.out.println();
//            }
            for (int i = 0; i < n; i++) {
                if (arr[1][i] == '1' && arr[0][i] == '0') {
                    arr[0][i] = '2';
                    res++;
                    continue;
                }
                try {
                    if (arr[0][i - 1] == '1' && arr[1][i] == '1' && i > 0) {
                        res++;
                        arr[0][i - 1] = '2';
                        continue;
                    }
                }catch (Exception e){

                }
                try {
                    if (arr[0][i + 1] == '1' && arr[1][i] == '1' && i <= n - 1) {
                        res++;
                        arr[0][i + 1] = '2';
                        continue;
                    }
                }catch (Exception e){

                }

            }
            System.out.println(res);
        }
    }
}
