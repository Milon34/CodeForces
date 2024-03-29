package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hit_the_Lottery {
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
        long n=sc.nextLong();
        long count=0;
        while (n!=0){
            if (n/100>0){
                count=count+n/100;
                n%=100;
            }
            if (n/20>0){
                count+=n/20;
                n%=20;
            }
            if (n/10>0){
                count+=n/10;
                n%=10;
//                count++;
            }
            if (n/5>0){
                count+=n/5;
                n%=5;
//                count++;
            }
            if (n==0){
                break;
            }
           // System.out.println(n);
            if (n<5){
                count+=n;
                n=0;
            }
        }
        System.out.println(count);
    }
}
