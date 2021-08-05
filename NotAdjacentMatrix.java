package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NotAdjacentMatrix {
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
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] dp=new int[n*n];
             for (int i=0;i<n*n;i++){
                 dp[i]=i+1;
             }
             if (n==2){
                 System.out.println(-1);
                 continue;
             }
            List<Integer> l1=new ArrayList<>();
            List<Integer> l2=new ArrayList<>();
             for (int i=0;i<dp.length;i++){
                 if (i%2==0){
                     l1.add(dp[i]);
                 }else {
                     l2.add(dp[i]);
                 }
             }
             List<Integer> myS=new ArrayList<>();
             myS.addAll(l1);
             myS.addAll(l2);
             int k=0;
             for (int i=0;i<n;i++){
                 for (int j=0;j<n;j++){
                     System.out.print(myS.get(k)+" ");
                     k++;
                 }
                 System.out.println();
             }
        }
    }
}
