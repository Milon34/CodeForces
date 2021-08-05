package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Sequential_Nim {
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
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(sc.nextInt());
            }
            List<String> s = new ArrayList<>();
            int count = 0;
            String[] str = {"First", "Second"};
            int k = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (l.get(i) != 1) {
                    count = i + 1;
                    continue;
                }
                try {
                    if (l.get(i) == 1) {
                        s.add(str[k % 2]);
                      //  l.set(i, 0);
                        k++;
                    } else if (l.get(i + 1) == 1) {
                        s.add(str[k % 2]);
                      //  l.set(i, 0);
                        k++;
                    } else {
                        s.add(str[(k + 1) % 2]);
                       // l.set(i, 0);
                        k += 2;
                    }
                } catch (Exception e) {

                }
            }
          //  System.out.println(s);
            if (count == 0 && l.get(l.size() - 1) == 1) {
                if (s.get(s.size() - 1).equals("First")) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            } else if (count % 2 != 0) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
//            if (s.size() == 0) {
//                System.out.println("First");
//            } else if (s.get(s.size() - 1).equals("Second")) {
//                System.out.println("First");
//            } else {
//                System.out.println("Second");
//            }
        }
    }
}
