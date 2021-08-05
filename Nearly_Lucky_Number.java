package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Nearly_Lucky_Number {
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
        RealScanner sc=new RealScanner();
        String s=sc.next();
        boolean check=true;
        int count=0;
        if (s.equals("4")||s.equals("7")){
            System.out.println("NO");
        }else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '4' || s.charAt(i) == '7') {
                   count++;
                }
            }
            if (count==7||count==4) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
