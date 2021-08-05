package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CodeC {
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
        int t = sc.nextInt();
        m:while (t-- > 0) {
            int k, n, m;
            k = sc.nextInt();
            n = sc.nextInt();
            m = sc.nextInt();
            List<Integer> l1 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l1.add(sc.nextInt());
            }
            List<Integer> l2 = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                l2.add(sc.nextInt());
            }
            Vector<Integer> ans = new Vector<>();
            int p = 0;
            int p1 = 0;
            mi:while (p < n && p1 < m) {
                if (l1.get(p) == 0) {
                    ans.add(0);
                    k++;
                    p++;
                    continue;
                }
                if (l2.get(p1) == 0) {
                    ans.add(0);
                    k++;
                    p1++;
                    continue;
                }

                if (l1.get(p) > l2.get(p1)) {
                    if (l2.get(p1) <= k) {
                        ans.add(l2.get(p1));
                        p1++;
                    } else {
                        System.out.println(-1);
                        continue m;
                    }
                } else {
                    if (l1.get(p) <= k) {
                        ans.add(l1.get(p));
                        p++;
                    } else {
                        System.out.println(-1);
                        continue m;
                    }
                }
            }
           // System.out.println("Mmm");
            if (p >= n) {
               for (int i = p1; i < m; i++) {
                    if (l2.get(p1) == 0) {
                        ans.add(0);
                        k++;
                        p1++;
                        continue;
                    }
                    if (l2.get(p1) <= k) {
                        ans.add(l2.get(p1));
                        p1++;
                    } else {
                        System.out.println(-1);
                        continue m;
                    }
                }
            }
            if (p1 >= m) {
               for (int i = p; i < n; i++) {
                    if (l1.get(p) == 0) {
                        ans.add(0);
                        k++;
                        p++;
                        continue;
                    }
                    if (l1.get(p) <= k) {
                        ans.add(l1.get(p));
                        p++;
                    } else {
                        System.out.println(-1);
                        continue m;
                    }
                }
            }
            for (int i :ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
