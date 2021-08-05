package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soft_Drinking {
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
        int n, k, l, c, d, p, nl, np;
        n=sc.nextInt();
        k=sc.nextInt();
        l=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        p=sc.nextInt();
        nl=sc.nextInt();
        np=sc.nextInt();
        int totalDrink,toast,enoughToast;
        totalDrink=k*l;
        toast=totalDrink/nl;
        enoughToast=c*d;
        int saltEnough=p/np;
        System.out.println(Math.min(toast,Math.min(enoughToast,saltEnough))/n);

    }
}
