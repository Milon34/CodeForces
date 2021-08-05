package Codeforces;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Kuriyama_Mirais_Stones {
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

        public static final class Pair<T1, T2> {
            public T1 first;
            public T2 second;

            public Pair() {
                first = null;
                second = null;
            }

            public Pair(T1 firstValue, T2 secondValue) {
                first = firstValue;
                second = secondValue;
            }

            public Pair(Pair<T1, T2> pair) {
                first = pair.first;
                second = pair.second;
            }

        }
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        PrintWriter out=new PrintWriter(System.out);
        long n = sc.nextInt();
        int max=100005;
        long[]v=new long[max];
        long[]l=new long[max];
        long[] per=new long[(int) n+1];
        for (long i = 1; i <= n; i++) {
            long a = sc.nextLong();
            v[(int) i]=a;
            per[(int) i]=a;
        }
        Arrays.sort(per);
        for (int i = 1; i <= n; i++) {
           v[i]+=v[i-1];
           l[i]+=l[i-1]+per[i];
        }
        int m= sc.nextInt();
        for (int i=0;i<m;i++){
            long a,b,c;
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            if (a==1){
                out.println(v[(int) c]-v[(int) (b-1)]);
            }else {
                out.println(l[(int) c]-l[(int) b-1]);
            }
        }
        out.flush();
        out.close();
    }
}
