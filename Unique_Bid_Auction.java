package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Unique_Bid_Auction {
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
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n+1];
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                l.add(a);
                arr[a]++;
            }
            int val=0;
            for (int i=0;i<n+1;i++){
                if (arr[i]==1){
                    val=i;
                    break;
                }
            }
            if (l.indexOf(val)+1==0){
                System.out.println(-1);
            }else {
                System.out.println(l.indexOf(val) + 1);
            }
        }
    }
}
