package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Little_Girl_and_Game {
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
        int count = 0;
        String myS = "abcdefghijklmnopqrstuvwxyz";
        //Calculate the number of occurrence
        for (int i = 0; i < myS.length(); i++) {
            HashMap<Integer, Integer> m = new HashMap<>();
            char ch = myS.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    m.put(i, m.getOrDefault(i, 0) + 1);
                }
            }
            // System.out.println(m);
            if (!m.isEmpty() && (m.get(i) % 2) == 1) {
                count++;
            }
        }
        //  System.out.println(count);     //all character occurrences count ,divide by 2 and Mod==0 then return "Second" ;
        if (count == 0 || count % 2 == 1) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}
