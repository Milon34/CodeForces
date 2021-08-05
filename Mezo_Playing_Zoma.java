package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mezo_Playing_Zoma {
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
        String s=sc.next();
        int left=0,right=0;
        for (int i=0;i<n;i++){
            if (s.charAt(i)=='L'){
                left--;
            }
            if (s.charAt(i)=='R'){
                right++;
            }
        }
        System.out.println(right-left+1);
//        if (left<0&&right<0){
//            System.out.println(Math.abs(left-right)+1);
//        }else if (left<0&&right>0){
//            System.out.println(Math.abs(left-right)+1);
//        }else if (left>0&&right>0){
//            System.out.println(Math.abs(left-right)+1);
//        }else if (left>0&&right<0){
//            System.out.println(Math.abs(left-right)+1);
//        }else {
//            System.out.println(0);
//        }

    }
}
