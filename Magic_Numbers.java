package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Magic_Numbers {
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
        String s = sc.next();
//        int count1=0,count4=0;
        boolean check = true;
        for (int i = 0;i < s.length();) {
            try {
                if (s.charAt(i) == '1' && s.charAt(i + 1) == '4' && s.charAt(i + 2) == '4') {
                    i += 3;
                    continue;
                }
                if (s.charAt(i) == '1' && s.charAt(i + 1) == '4') {
                    i += 2;
                    continue;
                }
                if (s.charAt(i) == '1') {
                    i++;
                } else {
                    check = false;
                    break;
                }
            }catch (Exception e){
                break;
            }
        }
        if (check){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
