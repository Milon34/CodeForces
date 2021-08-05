package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Sort_the_Array {
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

    static boolean isSorted(List<Integer> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i) > array.get(i + 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        int min = Collections.min(l);
        if (l.get(0) == min) {
            for (int i = 0; i < l.size() - 1; i++) {
                if (l.get(i) > l.get(i + 1)) {
                    int val = l.get(i);
                    l.set(i, l.get(i + 1));
                    l.set(i + 1, val);
                    if (isSorted(l)) {
                        System.out.println("yes");
                        System.out.println(i + " " + (i + 1));
                        break;
                    } else {
                        System.out.println("no");
                        break;
                    }
                }else {
                    System.out.println("yes");
                    System.out.println(1+" "+1);
                    break;
                }
            }
        }else {
            int per=l.get(0);
            int idx=l.indexOf(min);
            l.set(0,min);
            l.set(idx,per);
            if (isSorted(l)){
                System.out.println("yes");
                System.out.println(1+" "+(idx+1));
            }else {
                System.out.println("no");
            }
        }

    }
}
