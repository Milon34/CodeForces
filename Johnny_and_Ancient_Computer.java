package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Johnny_and_Ancient_Computer {
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
            long a=sc.nextLong();
            long b=sc.nextLong();
            long val1,val2;
            val1=Math.max(a,b);
            val2=Math.min(a,b);
            long count=0;
            while (val1>val2){
                if (val2*8<=val1){
                    val2*=8;
                }else if (val2*4<=val1){
                    val2*=4;
                }else {
                    val2*=2;
                }
                count++;
            }
            if (val1==val2) {
                System.out.println(count);
            }else {
                System.out.println(-1);
            }
        }
    }
}
