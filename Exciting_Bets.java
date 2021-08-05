package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exciting_Bets {
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
        int test = sc.nextInt();
        while (test-- > 0) {
            long a, b;
            a = sc.nextLong();
            b = sc.nextLong();
            long myS, myS1, per1, per2;
            if (a > b) {
                myS = a - b;
            } else {
                myS = b - a;
            }
//            public  static int gcd(int a,int b){//Gcd Calculate
//                if (a==0){
//                    return b;
//                }
//                return gcd(b%a,a);
//            }
            if (a == b) {
                System.out.println(0 + " " + 0);  //equal
            } else if (a == 0) {
                System.out.println(myS + " " + 0);//zero
            } else if (myS == 1) {                //one
                System.out.println(1 + " " + 0);
            } else {
                         //step by step
                myS1 = a % myS;
                if (myS1 == 0) {
                    System.out.println(myS + " " + myS1);
                } else {
                    per1 = myS1;
                    per2 = myS - myS1;
                    if (per1 > per2) {
                        myS1 = per2;
                    } else {
                        myS1 = per1;
                    }
                    System.out.println(myS + " " + myS1);
                }
            }
        }
    }
//    static class RealScanner {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer("");
//
//        String next() {
//            while (!st.hasMoreTokens())
//                try {
//                    st = new StringTokenizer(br.readLine());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            return st.nextToken();
//        }
//
//        int nextInt() {
//            return Integer.parseInt(next());
//        }
//
//        int[] readArray(int n) {
//            int[] a = new int[n];
//            for (int i = 0; i < n; i++) a[i] = nextInt();
//            return a;
//        }
//
//        long nextLong() {
//            return Long.parseLong(next());
//        }
//    }
}
