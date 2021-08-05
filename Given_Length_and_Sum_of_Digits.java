package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Given_Length_and_Sum_of_Digits {
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

    static int maxVal(int num) {
        int count[] = new int[10];
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i) - '0']++;
        int res = 0, mul = 1;
        String s="";
        for (int i = 0; i <= 9; i++) {
            while (count[i] > 0) {
                res = res + (i * mul);
                s+=res;
                count[i]--;
                mul = mul * 10;
            }
        }
        System.out.println(s);
        return res;
    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int m = sc.nextInt();
        int s = sc.nextInt();
        m:for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                int val = i + j;
                String myS = String.valueOf(val);
                int sum = 0;
                for (int k = 0; k < myS.length(); k++) {
                    sum += myS.charAt(k) - 48;
                }
                if (sum == s) {
                    StringBuffer sb = new StringBuffer(myS);
                    if ((myS.length() == m) && (myS.charAt(myS.length() - 1) != '0')) {
                        System.out.println(myS + " " + maxVal(val));
                        return;
                    } else if (myS.length() == m) {
                        System.out.println(myS + " " + myS);
                        return;
                    }
                }
            }
        }
        System.out.println("-1 -1");
    }
}
