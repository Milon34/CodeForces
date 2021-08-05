package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class The_number_of_positions {
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
        RealScanner sc=new RealScanner();
        int n,a,b;
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
//        if(a>=b){
//            System.out.println(n-a);
//        }else {
//            System.out.println(n-b);
//        }
//        List<Integer> l=new ArrayList<>();
        int count=0;
        for (int i=1;i<=n;i++){
            if (i-1>=a&&n-i<=b){
                count++;
            }
        }
       // System.out.println(Collections.min(l));
        System.out.println(count);
    }
}
