package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Per {
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
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
//            if (a==1&&b==1&&c==0){
//                System.out.println("YES");
//            } else if (a==b){
//                if ((a/b)+a==c){
//                    System.out.println("YES");
//                }else {
//                    System.out.println("NO");
//                }
//            }else {
//                if (Math.abs(a-b)==c){
//                    System.out.println("YES");
//                }else {
//                    System.out.println("NO");
//                }
//            }
            if ((a * b) - 1 == c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

class Test1 {
    public static Double addValues(Double[] val) {
        return Arrays.stream(val).anyMatch(Objects::isNull) ? null : Arrays.stream(val).collect(Collectors.summingDouble(Double::doubleValue));
    }
    public static void main(String[] args) {
        Double[] val = new Double[]{1d, null, 3d};
        Double sum = addValues(val);
        System.out.println(sum);


    }
}