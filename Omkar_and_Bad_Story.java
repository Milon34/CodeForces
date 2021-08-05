package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Omkar_and_Bad_Story {
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
        PrintWriter out=new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
           int n=sc.nextInt();
           int[]arr=new int[n];
           int count=0;
           for (int i=0;i<n;i++){
               arr[i]=sc.nextInt();
               if (arr[i]<0){
                   count++;
               }
            }
           if (count!=0){
               System.out.println("NO");
           }else {
               System.out.println("YES");
               System.out.println(101);
               for (int i=0;i<101;i++){
                   System.out.print(i+" ");
               }
               System.out.println();
           }
        }
        out.flush();
        out.close();
    }
}
