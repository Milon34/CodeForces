package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Divisors_of_Two_Integers {
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
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        int maxVal = Collections.max(l);
        Collections.sort(l);
        int[] arr=new int[10005];
        int[] arr1=new int[150];
        int k=0;
        for (int i = 0; i < n; i++) {
            if (arr[l.get(i)]==0 && maxVal % l.get(i) == 0) {
                arr[l.get(i)]=1;
            } else {
                k++;
               arr1[k]=l.get(i);
            }
        }
        //System.out.println(k);
       // Arrays.sort(arr1);
       // System.out.println(Arrays.toString(arr1));
        System.out.println(maxVal+" "+arr1[k]);
}
}
