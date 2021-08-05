package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Average_Height {
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
        RealScanner sc = new RealScanner();
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            List<Integer> l=new ArrayList<>();
            Vector<Integer> v1=new Vector<>();
            Vector<Integer> v2=new Vector<>();
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                if (a%2==0){
                    v1.add(a);
                }else {
                    v2.add(a);
                }
            }
           for (int i=0;i<v1.size();i++){
               System.out.print(v1.get(i)+" ");
           }
           for (int i=0;i<v2.size();i++){
               System.out.print(v2.get(i)+" ");
           }
            System.out.println();
        }
    }
}
