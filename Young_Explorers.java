package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Young_Explorers {
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
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int per=0,count=0;
            for (int i=0;i<n;i++){
                per++;
                if (per==arr[i]){
                    count++;
                    per=0;
                }
            }
            System.out.println(count);
        }
    }
}