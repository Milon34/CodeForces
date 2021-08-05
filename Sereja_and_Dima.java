package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sereja_and_Dima {
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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //Arrays.sort(arr);
        int sum1 = 0, sum2 = 0, i = 0, j = n - 1, max = 0, k = 0;
        while (i <= j) {
            if (arr[i] >= arr[j]) {
                max = arr[i];
                i++;
            } else {
                max = arr[j];
                j--;
            }
            if (k % 2 == 0)
                sum1 += max;
            else
                sum2 += max;
            k++;
        }
        System.out.println(sum1 + " " + sum2);
    }
}
