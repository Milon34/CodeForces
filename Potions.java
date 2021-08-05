package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Potions {
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
        long n = sc.nextLong();
        Long[] arr = new Long[(int) n];
        List<Long> l = new ArrayList<>();
        long count = 0, sum = 0;
        for (long i = 0; i < n; i++) {
            arr[(int) i] = sc.nextLong();
//            if (arr[(int) i] >= 0) {
//                count++;
//                sum+=arr[(int) i];
//            }
//            if (arr[(int) i]<0){
//                l.add(arr[(int) i]);
//            }
            sum += arr[(int) i];
        }
        Arrays.sort(arr);
        if (sum >= 0) {
            System.out.println(n);
            return;
        }
        for (long i = 0; i < n; i++) {
            if (sum - arr[(int) i] >= 0) {
                count++;
                break;
            } else {
                continue;
            }
        }
        System.out.println(n - count);
    }
}
