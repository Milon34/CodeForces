package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AND_0_Sum_Big {
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
//test
//    static int pairAndSum(int arr[], int n) {
//        int ans = 0;
//        for (int i = 0; i < 32; i++) {
//            int k = 0;
//            for (int j = 0; j < n; j++) {
//                if ((arr[j] & (1 << i)) != 0)
//                    k++;
//            }
//            ans += (1 << i) * (k * (k - 1) / 2);
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        long t=sc.nextInt();
        while (t-->0){
            long n,k;
            long mod= (long) (1e9+7);
            n=sc.nextLong();
            k=sc.nextLong();
            long res=1;
            for (int i=0;i<k;i++){
                res*=n;
                res%=mod;
            }
            System.out.println(res);
        }

    }
}
//}
