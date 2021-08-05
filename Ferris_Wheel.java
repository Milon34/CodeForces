package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ferris_Wheel {
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
        PrintWriter out=new PrintWriter(System.out);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0, j = n - 1, take = 1, count = 0;
        int cur = arr[j];
        while (i < j) {
            if (take == 2) {
                count++;
                j--;
                cur = arr[j];
                take = 1;
            } else if (cur + arr[i] > k) {
                count++;
                j--;
                cur = arr[j];
                take = 1;
            } else {
                cur += arr[i];
                i++;
                take++;
            }
        }
        out.println(count + 1);
        out.flush();
        out.close();
    }

}
