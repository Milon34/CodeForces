package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Almost_Rectangle {
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
//        RealScanner sc=new RealScanner();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char[][] ch = new char[n][n];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < s.length(); j++) {
                    ch[i][j] = s.charAt(j);
                }
            }
            List<Integer> l1 = new ArrayList<>();
            List<Integer> l2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (ch[i][j] == '*') {
                        l1.add(i);
                        l2.add(j);
                    }
                }
            }
            System.out.println(l1);
            System.out.println(l2);
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(ch[i][j]);
                }
                System.out.println();
            }
        }
    }
}
