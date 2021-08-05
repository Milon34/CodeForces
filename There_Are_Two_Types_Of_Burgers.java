package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class There_Are_Two_Types_Of_Burgers {
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
        int t = sc.nextInt();
        while (t-- > 0) {
            long a, b, c, a1, a2;
            a = sc.nextLong();
            b = sc.nextLong();
            c = sc.nextLong();
            a1 = sc.nextLong();
            a2 = sc.nextLong();
            a /= 2;
            long res = 0;
//            m:if (b<c){
//                res+=b*a1;
//                a=a-2*b;
//                if (a<0){
//                    //break m;
//                }
//              if (a<=c){
//                  res+=a2*(a/2);
//              }else {
//                  res+=a2*(a/c);
//              }
//            }else if (b>c){
//                res+=c*a2;
//                a=a-2*c;
//                if (a<0){
//                    //break ;
//                }
//                if (a<=b){
//                    res+=a1*(a/2);
//                }else {
//                    res+=a1*(a/b);
//                }
//            }else {
//                if (2*b+(2*c)<=a){
//                    res+=(b*a1)+(c*a2);
//                }else {
//                    res += (a / 2) * (Math.max(a1, a2));
//                }
//            }
            if (a1 > a2) {
                res += Math.min(a, b) * a1;
                a -= b;
                if (a > 0) {
                    res += Math.min(a, c) * a2;
                }
            } else {
                res += Math.min(a, c) * a2;
                a -= c;
                if (a > 0) {
                    res += Math.min(a, b) * a1;
                }
            }
            System.out.println(res);
        }
    }
}
