package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Epic_Game {
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

    static int getGcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGcd(n2, n1 % n2);
    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int a, b, n;
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        int count = 0;
        int per = n;
        boolean check;
        while (true) {
            int val1 = getGcd(a, per);
            per = per - val1;
            if (per<=0){
                check=true;
                break;
            }
            int val2 = getGcd(b, per);
            per=per-val2;
            count++;
            if (per<=0) {
                check=false;
                break;
            }
        }
       if (!check){
           System.out.println(1);
       }else {
           System.out.println(0);
       }
    }
}
