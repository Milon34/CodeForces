package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Phoenix_and_Balance {
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
            long n=sc.nextLong();
            List<Long> l=new ArrayList<>();
            for (long i=1;i<=n;i++){
                l.add((long) Math.pow(2,i));
            }
            Collections.sort(l);
            long sum=0;
            for (long i=0;i<l.size()/2;i++){
                sum+=l.get((int) i);
            }
            System.out.println(sum);
//             if (l.size()<4){
//                 System.out.println(l.get(l.size()-1)-l.get(0));
//             }else {
//                 System.out.println(Math.abs((l.get(l.size()-1)+l.get(0))-(l.get(l.size()-2)+l.get(1))));
//             }
        }
    }
}
