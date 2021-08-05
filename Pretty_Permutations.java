package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pretty_Permutations {
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
            int[] arr=new int[n+1];
            for (int i=1;i<=n;i++){
                arr[i]=i;
            }
            if (n%2==1){
                int temp=arr[n-1];
                arr[n-1]=arr[n];
                arr[n]=temp;
            }
            for (int i=2;i<=n;i+=2){
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
            for (int i=1;i<=n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
