package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Different_is_Good {
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
        RealScanner sc=new RealScanner();
        int n=sc.nextInt();
        char[]ch=sc.next().toCharArray();
        HashSet<Character>h=new HashSet<>();
        for (int i=0;i<n;i++){
            h.add(ch[i]);
        }
        if (26-h.size()<n- h.size()){
            System.out.println(-1);
        }else {
            System.out.println(n-h.size());
        }
    }
}
