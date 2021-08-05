package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Collecting_Coins {
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
        long t=sc.nextLong();
        long[] arr=new long[3];
        while (t-->0){
            long a,b,c,n;
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            n= sc.nextLong();
            arr[0]=a;
            arr[1]=b;
            arr[2]=c;
            Arrays.sort(arr);
            long val=(arr[2]-arr[0])+(arr[2]-arr[1]);
            long diff=n-val;
            if (diff%3==0&&diff>=0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
