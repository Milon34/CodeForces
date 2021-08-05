package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BoxFitting {
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
    static long lowerBound(ArrayList<Long> a, long x) { // x is the target value or key
        long l=-1,r=a.size();
        while(l+1<r) {
            long m=(l+r)>>>1;
            if(a.get((int) m)>=x) r=m;
            else l=m;
        }
        return r;
    }
    public static void main(String[] args) {
        RealScanner sc=new RealScanner();
        long n,w;
        n=sc.nextLong();
        w= sc.nextLong();
        ArrayList<Long> v=new ArrayList<>();
        for (int i=0;i<n;i++){
            v.add(sc.nextLong());
        }
        Collections.sort(v);
        ArrayList<Long> sp=new ArrayList<>();
        for (long i=n-1;i>=0;i--){
            long look=v.get((int) i);
            long it=lowerBound(v,look)-v.get(0);
            sp.add(sp.get((int) it)-v.get((int) i));
        }
        long ans=lowerBound(sp,w)-v.get(0);
        System.out.println(ans);
    }
}
