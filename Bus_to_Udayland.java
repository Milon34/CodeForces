package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bus_to_Udayland {
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
        List<String> l = new ArrayList<>();
        int in = 0;
        boolean check = false;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.contains("OO") && in == 0) {
                check = true;
                s = s.replaceFirst("OO", "++");
                l.add(s);
                in++;
            } else {
                l.add(s);
            }
        }
        if (check) {
            System.out.println("YES");
            for (String s:l){
                System.out.println(s);
            }
        }else {
            System.out.println("NO");
        }
    }
}
