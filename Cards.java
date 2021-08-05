package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Cards {
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
        String s = sc.next();
        int countZ = 0, countE = 0, countN = 0, countO = 0, countR = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'z') {
                countZ++;
            } else if (s.charAt(i) == 'e') {
                countE++;
            } else if (s.charAt(i) == 'n') {
                countN++;
            } else if (s.charAt(i) == 'o') {
                countO++;
            } else {
                countR++;
            }
        }
//        char[] per=s.toCharArray();
//        Arrays.sort(per);
//        System.out.println(Arrays.toString(per));
        List<Integer> l=Arrays.asList(countO, countN, countE, countZ, countE, countR, countO);
        int[] arr = {countO, countN, countE, countZ, countE, countR, countO};
        //System.out.println(Arrays.toString(arr));
        if (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) {
            int val = Math.min(countO, Math.min(countN, countE));
            for (int i = 0; i < val; i++) {
                System.out.print(1 + " ");
            }
            arr[l.indexOf(val)] = 0;
        }
        if (arr[3] > 0 && arr[4] > 0 && arr[5] > 0 && arr[6] > 0) {
            int val = Math.min(arr[3], Math.min(arr[4], Math.min(arr[5], arr[6])));
            for (int i = 0; i < val; i++) {
                System.out.print(0 + " ");
            }
        }

    }
}
