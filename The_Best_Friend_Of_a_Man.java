package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class The_Best_Friend_Of_a_Man {
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
        int sum=0;
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
//        if (sum==k){
//            System.out.println(sum+k);
//        }else if (sum>k){
//            System.out.println(0);
//        }else {
//            System.out.println(k-sum);
//        }
        int s=arr[0];
        for (int i=1;i<n;i++){
            arr[i]=Math.max(k-arr[i-1],arr[i]);
            s+=arr[i];
        }
        System.out.println(Math.abs(sum-s));
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
