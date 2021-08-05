package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TMT_Document {
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

    static boolean isSub(String str1, String str2,
                         int m, int n) {

        if (m == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return isSub(str1, str2, m - 1, n - 1);
        }

        return isSub(str1, str2, m, n - 1);
    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int countT = 0, countM = 0;
            boolean check = true;
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)=='T'){
                    countT++;
                }else {
                    countM++;
                }
                if (countT<countM)
                {
                    check=false;
                }
            }

//            for (int i = 0; i <= s.length()-1; i++) {
//                if (s.charAt(i) == 'T') {
//                    int idx1 = s.indexOf('T');
//                    int idx2 = s.indexOf('M');
//                    int idx3 = s.lastIndexOf('T');
//                   // System.out.println(idx1 + " " + idx2 + " " + idx3);
//                    if (idx1<idx2&&idx2<idx3){
//                        check=true;
//                        s=s.replaceFirst("T","");
//                        s=s.replaceFirst("M","");
//                        s = s.substring(0, idx3-2) + "" + s.substring(idx3-1);
//                       // System.out.println(s);
//                    }else {
//                        check=false;
//                        break;
//                    }
//                }
//            }
            if (countM*2!=countT){
                check=false;
            }
            countM=0;countT=0;
            for (int i=n-1;i>=0;i--){
                if (s.charAt(i)=='T'){
                    countT++;
                }else {
                    countM++;
                }
                if (countT<countM){
                    check=false;
                }
            }
            if (check){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
//            for (int i = 0; i <= s.length() - 2; i++) {
//                if (s.charAt(i) == 'T') {
//                    int idx1 = s.indexOf('T');
//                    int idx2 = s.lastIndexOf('M');
//                    int idx3 = s.lastIndexOf('T');
//                    System.out.println(idx1 + " " + idx2 + " " + idx3);
//                    if (idx1 < idx2 && idx2 < idx3) {
//                        check = true;
//                        s = s.replace("T", "");
//                        s = s.replace("M", "");
//                        s = s.replaceFirst("T", "");
//                        System.out.println(s);
//                    } else {
//                        check = false;
//                        break;
//                    }
//                }
//            }
//            for (int i=0;i<s.length();i++){
//                if (s.charAt(i)=='T'){
//                    countT++;
//                }else {
//                    countM++;
//                }
//            }
//            if (isSub("TMT",s,3,s.length())&&countM*2==countT){
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
//            }
//            if (check) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//            for (int i=0;i<s.length()-2;i++){
//                if (s.charAt(i)=='T'){
//                    countT++;
//                }else {
//                    countM++;
//                }
//            }
//            if (countM*2==countT){
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
//            }
        }
    }
}
