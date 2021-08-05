package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Mean_Inequality {
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
        int test=sc.nextInt();
        while (test-->0){
            int n=sc.nextInt();
           int[] arr=new int[2*n];
           for (int i=0;i<2*n;i++){
               arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
           Vector<Integer> l1=new Vector<>();
           Vector<Integer> l2=new Vector<>();
           for (int i=0;i<arr.length/2;i++){
               l1.add(arr[i]);
           }
           for (int i=arr.length/2;i<arr.length;i++){
               l2.add(arr[i]);
           }
           for (int i=0;i<l1.size();i++){
               System.out.print(l1.get(i)+" ");
               System.out.print(l2.get(i)+" ");
           }
            System.out.println();
        }
    }
}
