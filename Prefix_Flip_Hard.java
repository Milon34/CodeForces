package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Prefix_Flip_Hard {
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

    public static List<Integer> OPS(char[] m) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < m.length; i++) {
            if (m[i] != m[i - 1]) {
                res.add(i - 1);
            }
        }
        if (m[m.length - 1] == '1') {
            res.add(m.length - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            List<Integer> l1 = OPS(ch1);
            List<Integer> l2 = OPS(ch2);
//            System.out.println(l1);
//            System.out.println(l2);
            long val = l1.size() + l2.size();
            System.out.print(val+" ");
            for (int i=0;i<l1.size();i++){
                System.out.print((l1.get(i)+1)+" ");
            }
            for (int i=l2.size()-1;i>=0;i--){
                System.out.print((l2.get(i)+1)+" ");
            }
            System.out.println();

        }
    }
}
