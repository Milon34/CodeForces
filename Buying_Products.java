package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Buying_Products {
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
        while (t--  >0){
            long n,k;
            n=sc.nextLong();
            k=sc.nextLong();
            List<Long> l=new ArrayList<>();
            for (long i=0;i<n;i++){
                long[] arr=new long[3];
                long a,b,c;
                a=sc.nextLong();
                b=sc.nextLong();
                c=sc.nextLong();
                arr[0]=a;
                arr[1]=b;
                arr[2]=c;
                Arrays.sort(arr);
                l.add(arr[0]);
                l.add(arr[1]);
            }
            Collections.sort(l);
            //System.out.println(l);
            long sum=0;
            for (long i=0;i<k;i++){
                sum+=l.get((int) i);
            }
            System.out.println(sum);
        }
    }
}
