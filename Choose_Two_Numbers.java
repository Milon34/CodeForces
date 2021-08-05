package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Choose_Two_Numbers {
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
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        int m=sc.nextInt();
        List<Integer> l2=new ArrayList<>();
        for (int i=0;i<m;i++){
            l2.add(sc.nextInt());
        }
        m:for (int i=0;i<l.size();i++){
            for (int j=0;j<l2.size();j++){
                if (!l.contains(l.get(i)+l2.get(j))&&!l2.contains(l.get(i)+l2.get(j))){
                    System.out.println(l.get(i)+" "+l2.get(j));
                    break m;
                }
            }
        }
    }
}
