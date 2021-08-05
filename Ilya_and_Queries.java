package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Ilya_and_Queries {
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
        String s = sc.next();
        int count=0;
        int[] dp=new int[100005];
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
            dp[i+1]=count;
        }
        int n = sc.nextInt();
        for (int i=0;i<6;i++){
            System.out.print(dp[i]+" ");
        }
        while (n-- > 0) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            //out.println(Math.abs(dp[a-1]-dp[b-1]));
        }
        out.flush();
        out.close();
    }
}
