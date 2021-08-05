package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Game_01 {
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
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            String per = s;
            int count1=0,count2=0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
//                    String ch1= String.valueOf(s.charAt(i));
//                    String ch2= String.valueOf(s.charAt(i+1));
//                    per=per.replace(ch1,"");
//                    per=per.replace(ch2,"");
                    count1++;
                }
                if (s.charAt(i) == '0') {
//                    String ch1= String.valueOf(s.charAt(i));
//                    String ch2= String.valueOf(s.charAt(i+1));
//                    per=per.replace(ch1,"");
//                    per=per.replace(ch2,"");
                    count2++;
                }
            }
           int val=Math.min(count1,count2);
            if (val%2==0){
                System.out.println("NET");
            }else {
                System.out.println("DA");
            }

        }
    }
}
