package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Yet_Another_Card_Deck {
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
        PrintWriter out=new PrintWriter(System.out);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        LinkedList<Integer> l=new LinkedList<>();
        for (int i = 0; i < n; i++) {
           l.add(sc.nextInt());
        }
        int[] arrFast=new int[k];
        for (int i = 0; i < k; i++) {
            arrFast[i]=sc.nextInt();
        }
        int arr[]=new int[k];
        for (int i = 0; i < arrFast.length; i++) {
            int valFast=l.indexOf(new Integer(arrFast[i]));
            arr[i]=valFast+1;
            l.remove(valFast);
            l.addFirst(arrFast[i]);
        }
        for (int i:arr){
            out.print(i+" ");
        }
        out.flush();
        out.close();
    }
}
