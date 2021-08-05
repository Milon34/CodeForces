package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Sol {
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
    static boolean is(int n)
    {
        long le = 1, ri= n;

        while (le <= ri)
        {
            long mid = (le + ri) / 2;
            if (mid * mid == n)
            {
                return true;
            }
            if (mid * mid < n)
            {
                le = mid + 1;
            }
            else
            {
                ri = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        RealScanner sc=new RealScanner();
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<Integer> l=new ArrayList<>();
            boolean check=true;
             for (int i=0;i<n;i++){
                l.add(sc.nextInt());
             }
             for (int i=0;i<n;i++){
                 if (!is(l.get(i))){
                     check=false;
                     break;
                 }
             }
            if (check){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
