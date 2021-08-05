package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maximum_Cost_Deletion {
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
            int n, a, b;
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            String s = sc.next();
            int ans;
            if (b < 0) {
                int var = 0;
                char c = s.charAt(0);
                char m = s.charAt(0);
                for (char it : s.toCharArray()) {
                    if (it != c && it != m) {
                        var++;
                    }
                    c = it;
                }
                var += 1;
                ans = n * a + var * b;
            } else {
                ans = n * a + n * b;
            }
            System.out.println(ans);
        }


//            int count=0;
//            if (b>=0) {
//                System.out.println((a +b)*n);
//            } else {
//                if (s.charAt(0)=='1') {
//                    for (int i = 0; i < s.length(); i++) {
//                        if (s.charAt(i) == '1') {
//                            count++;
//                        } else {
//                            break;
//                        }
//                    }
//                }else {
//                    for (int i = 0; i < s.length(); i++) {
//                        if (s.charAt(i) == '0') {
//                            count++;
//                        } else {
//                            break;
//                        }
//                    }
//                }
//                System.out.println(a*(n+(b*(count/2))));
    }
}

