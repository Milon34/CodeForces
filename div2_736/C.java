package Codeforces.div2_736;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class C {
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
    public static HashSet<Integer>[] init(int length) {
        HashSet<Integer>[] array = new HashSet[length];
        for (int i = 0; i < length; i++) {
            array[i] = new HashSet<Integer>();
        }
        return array;
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        HashSet<Integer>[] s = init(n + 1);
        for (int i = 1; i <= m; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            if (u > v) {
                s[v].add(u);
            } else {
                s[u].add(v);
            }
        }
//        for (int i=0;i<s.length;i++){
//            System.out.println(s[i]);
//        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (s[i].isEmpty()) {
                ans++;
            }
        }
        int q = sc.nextInt();
        List<Integer>l=new ArrayList<>();
                                        //not empty set
        m:while (q-- > 0) {
            int k=sc.nextInt();
            if (k == 3) {
                System.out.println(ans);  //res
            } else {
                int u, v;
                u = sc.nextInt();
                v = sc.nextInt();
                if (u > v) {
                    int temp = v;
                    v = u;
                    u = temp;
                }
                if (k != 1) {
                    s[u].remove(v);
                    if (s[u].isEmpty()) {
                        ans++;
                    }
                } else {
                    if (s[u].isEmpty()) {
                        ans--;
                    }
                    s[u].add(v);
                }
            }
        }
    }
}