package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Panoramix_Prediction {
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
    static List<Integer> prime=new ArrayList<>();
    public static void allPrime() {

        int i,num;
        for (i = 1; i <= 55; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                prime.add(i);
            }
        }
    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        allPrime();
        int idx=prime.indexOf(a);
        //System.out.println(idx);
        if (prime.get(idx+1)==b){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
