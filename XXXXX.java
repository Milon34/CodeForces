package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XXXXX {
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

        public static final class Pair<T1, T2> {
            public T1 first;
            public T2 second;

            public Pair() {
                first = null;
                second = null;
            }

            public Pair(T1 firstValue, T2 secondValue) {
                first = firstValue;
                second = secondValue;
            }

            public Pair(Pair<T1, T2> pair) {
                first = pair.first;
                second = pair.second;
            }

        }
    }

    public static void main(String[] args) {
        RealScanner sc=new RealScanner();
        int t=sc.nextInt();
        while (t-->0){
            int n,x;
            n=sc.nextInt();
            x=sc.nextInt();
            int[] arr=new int[n];
            int idx=-1,l=0;
            int sum=0;
            for (int  i=0;i<n;i++){
               int a=sc.nextInt();
               arr[i]=a;
               if (a%x!=0){
                   if (idx==-1){
                       idx=i;
                       l=i;
                   }
               }
               sum+=a;
            }
            if (sum%x!=0){
                System.out.println(n);
            }else if (idx==-1){
                System.out.println(-1);
            }else {
                if (arr[0]==0) {
                    System.out.println(n - Math.min(idx + 1, n - l)+1);
                }else {
                    System.out.println(n - Math.min(idx + 1, n - l));
                }
            }
        }
    }
}
