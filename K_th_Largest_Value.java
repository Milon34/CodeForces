package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class K_th_Largest_Value {
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
        int n, q;
        n = sc.nextInt();
        q = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            count += arr[i];
        }

        // Arrays.sort(arr);
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 1) {
                if (arr[b-1] == 1) {
                    count--;
                } else {
                    count++;
                }
                arr[b-1] = 1-arr[b-1];
            } else {
                if (count >= b) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
//            if (a == 1) {
//                arr[i] = 0;
//            } else {
//                int count1 = 0, count0 = 0;
//                for (int m = 0; m < b; m++) {
//                    if (arr[m] == 1) {
//                        count1++;
//                    } else {
//                        count0++;
//                    }
//                }
//                if (count1 >= count0) {
//                    System.out.println(1);
//                } else {
//                    System.out.println(0);
//                }
//            }
        }
    }
}
