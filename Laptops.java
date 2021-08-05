package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Laptops {
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
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        boolean check=false;
        for (int i=0;i<n;i++){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if (a<b){
                check=true;
                break;
            }else if (a>b){
                check=true;
                break;
            }
        }
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
        if (check){
            System.out.println("Happy Alex");
        }else {
            System.out.println("Poor Alex");
        }

    }
}
