package Codeforces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Backspace {
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
    static boolean is(String s, String t) {
        int p1 = 0, p2 = 0;
        while (p1 < s.length() && p2 < t.length()) {
            if (s.charAt(p1) == t.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p1++;
            }
        }
        return (p2 == t.length());
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        while (t-- > 0) {
            String a, b;
            a=sc.next();
            b=sc.next();
            if (a.length() % 2 != b.length() % 2) {
                a=a.substring(1,a.length());
            };
            if (!is(a, b)) {
                System.out.println("NO");
                continue;
            }
            List<Integer>l=new ArrayList<>();
            l.add(1);
            l.add(2);
           // l.add(8);
            long p = 0, pre = 0;
            for (int i = 0; i < a.length(); i++) {
                try {
                    if (a.charAt(i) == b.charAt((int) p) && (((i - pre) % 2) == 1) || pre == i) {
                        p++;
                        pre = i;
                    }
                }catch (Exception e){

                }
            }
            if ((p == b.length() && (a.length() - pre) % 2==1)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
