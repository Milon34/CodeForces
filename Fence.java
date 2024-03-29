package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Fence {
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
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        int sum=0;
        for (int i=0;i<n;i++){
            l.add(sc.nextInt());
            sum+=l.get(i);
        }
       // Collections.sort(l);
        int min=sum,res=0;
        for(int i=k;i<n;i++)
        {
            sum+=l.get(i)-l.get(i-k);
            if(sum<min){
                res=i-k+1;
                min = sum;
            }
        }
        System.out.println(res+1);
    }
}
