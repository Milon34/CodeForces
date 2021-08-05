package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bear_and_Finding_Criminals {
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
        int k = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int val = (int) Math.ceil((double) n / 2);
        int p = 0;
        if (arr[k - 1] == 1) {
            count++;
            p = 1;
        }
        if (val > k) {
            int idx = 0;
            for (int i = k - 1, j = k - 1; i < n && j >= 0; i++, j--) {
                if (arr[i] == 1 && arr[j] == 1 && p == 0) {
                    count += 2;
                }else {
                    p=0;
                }
                idx = i;
            }
            // System.out.println(idx);
            for (int i = idx + 1; i < n; i++) {
                if (arr[i] == 1) {
                    count++;
                }
            }
            System.out.println(count);
        } else if (val < k) {
            int idx = 0;
            for (int i = k - 1, j = k - 1; i < n && j >= 0; i++, j--) {
                if (arr[i] == 1 && arr[j] == 1&&p==0) {
                    count += 2;
                }else {
                    p=0;
                }
                idx = j;
            }
            for (int i = idx - 1; i >= 0; i--) {
                if (arr[i] == 1) {
                    count++;
                }
            }
            System.out.println(count);
        } else {
            int idx=0;
            for (int i = k - 1, j = k - 1; i < n && j >= 0; i++, j--) {
               // System.out.println(i + " " + j);
                if (arr[i] == 1 && arr[j] == 1&&p==0) {
                    count += 2;
                }else {
                    p=0;
                }
                idx=i;
            }
           // System.out.println(idx);
            for (int i=idx+1;i<n;i++){
               if (arr[i]==1){
                   count++;
               }
            }
            System.out.println(count);
        }
    }
}
