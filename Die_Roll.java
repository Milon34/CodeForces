package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Die_Roll {
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
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int max=Math.max(a,b);
        max=(6-max)+1;
        if (max%2==1){
            if (max==3){
                System.out.println("1/2");
            }else {
                System.out.println(max+"/"+6);
            }
        }else {
            if (max==4){
                System.out.println("2/3");
            }else {
                System.out.println(1+"/"+6/max);
            }
        }

    }
}
