package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Amr_and_Pins {
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
        long r, x, y, x1, y1;
        r = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        double l=Math.sqrt((((x1-x)*(x1-x))+((y1-y)*(y1-y))));
        long res=(long)Math.ceil(((l/(2*r))));
//        if (2*res*r<x){
//            res++;
//        }
        System.out.println(res);
//        BigDecimal a1 = BigDecimal.valueOf(x);
//        BigDecimal a2 = BigDecimal.valueOf(y);
//        BigDecimal b1 = BigDecimal.valueOf(x1);
//        BigDecimal b2 = BigDecimal.valueOf(y1);
//        BigDecimal val1 = b1.subtract(a1);
//        BigDecimal val2 = b2.subtract(a2);
//        BigDecimal per1 = val1.multiply(val1);
//        BigDecimal per2 = val2.multiply(val2);
//        BigDecimal l = per1.add(per2);
//        BigDecimal sqrt = l.sqrt(new MathContext(10));
//        BigDecimal m = BigDecimal.valueOf(r);
//        BigDecimal res=sqrt.divide(m.multiply(new BigDecimal(2)));
//        System.out.println(res.setScale(0, RoundingMode.CEILING));
    }
}
