package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Last_Years_Substring {
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
            int n = sc.nextInt();
            String s = sc.next();
            boolean check=false;
            for (int i=0;i<=4;i++){
                String myS="";
                for (int j=0;j<i;j++){
                    myS+=s.charAt(j);
                }
                for (int j=n-4+i;j<n;j++){
                    myS+=s.charAt(j);
                }
                if (myS.equals("2020")){
                    check=true;
                    break;
                }
            }
            if (check){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
//            int count = 0;
//            boolean check = false;
//            int i1 = 0, i2 = 0,count0=0,count1=0;
//            for (int i = 0; i < s.length()/2; i++) {
//                if (s.charAt(i) == '2') {
//                    i1 = i;
//                    count0++;
//                }
//                if (s.charAt(i) == '0') {
//                    i2 = i;
//                    count1++;
//                }
//                if (count0!=0&&count1!=0&&count0+count1>=2&&i1 < i2) {
//                    System.out.println(i1+" "+i2);
//                    check = true;
//                    break;
//                }
//            }
////            i1 = 0;
////            i2 = 0;
////            boolean sCheck=false;
////            int per=0;
////             count0=0;count1=0;
////            for (int i = n - 1; i >= 0; i--) {
////                if (s.charAt(i) == '0'&&per==0) {
////                    i1 = i;
////                    count0++;
////                    per++;
////                } if (s.charAt(i) == '2') {
////                    i2 = i;
////                    count1++;
////                }
////                if (count0+count1<2&&i1>i2){
////                    System.out.println(i1+" "+i2);
////                    sCheck=true;
////                    break;
////                }
////            }
//            if (count0!=0&&count1!=0&&check&&(s.charAt(s.length()-1)=='0'&&s.charAt(s.length()-2)=='2')){
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
//            }
//        }
        }
    }
}
