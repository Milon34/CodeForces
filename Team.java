package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Team {
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

    public static boolean run(int a, int b, String pre) {
        StringBuffer sb = new StringBuffer(pre);
       // String s=pre;
        while (a > 0 || b > 0) {
            if (a == 0&&b == 1) {
                sb.append("0");
               // s+="0";
                b--;
            } else if (a > b) {
//                s+="011";
                sb.append("011");
                a -= 2;
                b--;
            } else {
//                s+="01";
                sb.append("01");
                a--;
                b--;
            }
            if (a < 0 || b < 0) {
                return false;
            }
        }
        System.out.println(sb);
        return true;
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (Math.ceil((double) b / a) > 3 && a != 1) {
            System.out.println(-1);
        } else {
            if ((b>=2&&run(b-2,a,"11"))){
            }else if ((b>=1&&run(b-1,a,"1"))){
            }else if (run(b,a,"")){
            }else {
                System.out.println(-1);
            }
        }
    }
}
