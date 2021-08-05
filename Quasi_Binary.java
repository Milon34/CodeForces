package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Quasi_Binary {
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
        String myS = "111111";
        String s = sc.next();
        int n = Integer.parseInt(s);
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(10);
        l.add(100);
        l.add(1000);
        l.add(10000);
        l.add(100000);
//        int clone;
//        if (s.length() == 1) {
//            for (int i = 0; i <n; i++) {
//                System.out.print(1 + " ");
//            }
//            System.out.println();
//            return;
//        }
//        List<Integer> add = new ArrayList<>();
//        while (n != 0) {
//            clone = n;
//            int m = 0, val = 1;
//            while (clone != 0) {
//                if (clone % 10 != 0) {
//                    m += val;
//                }
//                clone /= 10;
//                val *= 10;
//            }
//            add.add(m);
//            n -= m;
//        }
//        System.out.println(add.size());
//        for (int i : add) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            String helloS = String.valueOf(n);
            StringBuffer sb = new StringBuffer();
            for (int i = helloS.length() - 1; i >= 0; i--) {
                if (helloS.charAt(i) != '0') {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
            }
            sb.reverse();
            String con = String.valueOf(sb);
            int val = Integer.parseInt(con);
            list.add(val);
            n -= val;
        }
        System.out.println(list.size());
        for (int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
