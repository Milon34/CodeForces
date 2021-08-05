package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Omkar_and_Last_Class_of_Math {
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
static  int VAL= (int) 1e5;
    public static void main(String[] args) {
        RealScanner sc=new RealScanner();
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
//            List<Long> l=new ArrayList<>();
//           for (long i=n-1;i>=1;i--){
//               if (n%i==0){
//                   l.add(i);
//                   break;
//               }
//           }
//            for (int i=1;i<=900;i++){
//                if (n%i==0) {
//                    System.out.print(i+" ");
//                }
//            }
//            System.out.println();
           long val=0;
           for (long i=2;i<=VAL;i++){
               if (n%i==0){
                   val=i;
                   break;
               }
           }
           if (val==0){
               val=n;
           }
            System.out.println(n/val+" "+(n-(n/val)));
           // System.out.println(l.get(0)+" "+(n-l.get(0)));
        }
    }
}
