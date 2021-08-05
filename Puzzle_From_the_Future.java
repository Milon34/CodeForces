package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Puzzle_From_the_Future {
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
        PrintWriter out=new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            //String myS = "";
            int pre=-1;
            for (int i=0;i<s.length();i++){
                int x = s.charAt(i) - '0';
                if(x + 1 != pre) {
                    out.print("1");
                    pre = x + 1;
                }
                else {
                    out.print("0");
                    pre = x;
                }
            }
            out.println();
//            if (s.charAt(0) == '1') {
//                myS += '1';
//            } else {
//                myS += '1';
//            }
//            if (s.charAt(0) == '1') {
//                for (int i = 1; i < n; i++) {
//                    if (s.charAt(i) == '1') {
//                        myS += '0';
//                        try {
//                            if (s.charAt(i + 1) == '1') {
//                                myS += '1';
//                                i++;
//                            } else if (s.charAt(i + 1) == '0') {
//                                myS += '0';
//                                i++;
//                            }
//                        } catch (Exception e) {
//
//                        }
//                    } else {
//                        myS += '1';
//                        try {
//                            if (s.charAt(i + 1) == '0') {
//                                myS += '0';
//                                i++;
//                            } else if (s.charAt(i) == '1') {
//                                myS += '1';
//                                i++;
//                            }
//                        } catch (Exception e) {
//
//                        }
//                    }
//                }
//                System.out.println(myS);
//            } else {
//                int count=0;
//                for (int i = 1; i < s.length(); i++) {
//                    if (s.charAt(i) == '1') {
//                        if (count==2){
//                            myS+='0';
//                        }else {
//                            myS += '1';
//                        }
//                        try {
//                            if (s.charAt(i + 1) == '1') {
//                                myS += '0';
//                                i++;
//                            } else if (s.charAt(i + 1) == '0') {
//                                myS += '1';
//                                i++;
//                            }
//                        } catch (Exception e) {
//
//                        }
//                    } else {
//                        if (count==1) {
//                            myS += '1';
//                        } else {
//                            myS += '0';
//                        }
//                        try {
//                            if (s.charAt(i + 1) == '1') {
//                                myS += '1';
//                                count++;
//                                i++;
//                            } else if (s.charAt(i + 1) == '0') {
//                                myS += '1';
//                                i++;
//                            }
//                        } catch (Exception e) {
//
//                        }
//                    }
//                }
//                System.out.println(myS);
//            }
        }
        out.flush();
        out.close();
    }
}

