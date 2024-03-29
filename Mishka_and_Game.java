package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mishka_and_Game {
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
        int n=sc.nextInt();
        int countM=0,countC=0,countS=0;
        for (int i=0;i<n;i++){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if (a<b){
                countC++;
            }
            if (a>b){
                countM++;
            }
            if (a==b){
                countS++;
            }
        }
        if (countM>countC){
            System.out.println("Mishka");
        }else if (countM<countC){
            System.out.println("Chris");
        }else {
            System.out.println("Friendship is magic!^^");
        }

    }
}
