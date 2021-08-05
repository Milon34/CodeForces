package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Prinzessin_der_Verurteilung {
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
            Set<String> s = new HashSet<>();
            long n;
            n = sc.nextLong();
            char[] str;
            str = sc.next().toCharArray();
            int f = 0;
            for (int i = 0; i < n; i++) {
                String st = "";
                st += str[i];
                s.add(st);
            }
            for (int i = 0; i < n - 1; i++) {
                String st = "";
                st += str[i];
                st += str[i + 1];
                s.add(st);

            }
            for (int i = 0; i < n - 2; i++) {
                String st = "";
                st += str[i];
                st += str[i + 1];
                st += str[i + 2];
                s.add(st);
            }
            for (char i = 'a'; i <= 'z'; i++) {
                String st = "";
                st += i;
                List<String> l = new ArrayList<>();
                l.addAll(s);
                int count = 0;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(j).equals(st)) {
                        count++;
                    }
                }
                if (count <= 0) {

                    System.out.println(st);
                    f = 1;
                    break;
                }
            }
            if (f == 1) {
                continue;
            }
            for (char i = 'a'; i <= 'z'; i++) {
                String st = "";
                st += i;
                for (char j = 'a'; j <= 'z'; j++) {
                    String st1 = st;
                    st1 += j;
                    List<String> l = new ArrayList<>();
                    l.addAll(s);
                    int count = 0;
                    for (int k = 0; k < s.size(); k++) {
                        if (l.get(k).equals(st1)) {
                            count++;
                        }
                    }
                    if (count <= 0) {

                        System.out.println(st1);
                        f = 1;
                        break;
                    }
                }
                if (f == 1) break;
            }
            if (f == 1) {
                continue;
            }
            for (char i = 'a'; i <= 'z'; i++) {
                String st = "";
                st += i;
                for (char j = 'a'; j <= 'z'; j++) {
                    String st1 = st;
                    st1 += j;
                    for (char k = 'a'; k <= 'z'; k++) {
                        String st2 = st1;
                        st2 += k;
                        List<String> l = new ArrayList<>();
                        l.addAll(s);
                        int count = 0;
                        for (int m = 0; m < s.size(); m++) {
                            if (l.get(k).equals(st1)) {
                                count++;
                            }
                        }
                        if (count <= 0) {
                            System.out.println(st2);
                            f = 1;
                            break;
                        }
                    }
                    if (f == 1) break;
                }
                if (f == 1) break;
            }
        }
    }
}
