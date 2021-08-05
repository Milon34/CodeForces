package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Olesya_and_Rodion {
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
        String s="";
        if (n==1&&k==10){
            System.out.println(-1);
            return;
        }
        if (k!=10) {
            for (int i = 0; i < n; i++) {
                s+=k;
            }
            System.out.println(s);
        }else {
            String myS="1";
            for (int i=0;i<n-1;i++){
                myS+="0";
            }
            System.out.println(myS);
        }
    }
}
