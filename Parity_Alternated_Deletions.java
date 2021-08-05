package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Parity_Alternated_Deletions {
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
        int n = sc.nextInt();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        long odd = 0, even = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                l1.add(a);
                even++;
            } else {
                l2.add(a);
                odd++;
            }
        }
        Collections.sort(l1, Collections.reverseOrder());
        Collections.sort(l2, Collections.reverseOrder());
        List<Integer> myL = new ArrayList<>();
        myL.addAll(l1);
        myL.addAll(l2);
        //System.out.println(myL);
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (myL.get(i) % 2 != 0) {
                idx = i;
                break;
            }
        }
        // System.out.println(idx);
        if (even == odd || Math.abs(even - odd) == 1) {
            System.out.println(0);
        } else {
            long sum = 0;
            if (even > odd) {
                int k = 0;
                for (int i = 0; i < odd + 1; i++) {
                    try {
                        myL.remove(k);
                    } catch (Exception e) {

                    }
                }
               // System.out.println(myL);
                for (int i = 0; i < myL.size(); i++) {
                    if (myL.get(i) % 2 != 0) {
                        break;
                    } else {
                        sum += myL.get(i);
                    }
                }
            } else {
                int k = idx;
                for (int i = 0; i < even + 1; i++) {
                    try {
                        myL.remove(k);
                    } catch (Exception e) {

                    }
                }
                //System.out.println(myL);
                Collections.reverse(myL);
                for (int i = 0; i < myL.size(); i++) {
                    if (myL.get(i)%2==0){
                        break;
                    }else {
                        sum += myL.get(i);
                    }
                }
            }
            System.out.println(sum);
        }
//        for (int i = 0, j = 0; i < l1.size() && j < l2.size(); i++, j++) {
//            l1.remove(i);
//            l2.remove(j);
//        }
//        try {
//            l1.remove(0);
//        } catch (Exception e) {
//
//        }
//        try {
//            l2.remove(0);
//        } catch (Exception e) {
//
//        }
//        if (Math.abs(even-odd)==1){
//            try {
//                l1.remove(0);
//            } catch (Exception e) {
//
//            }
//            try {
//                l2.remove(0);
//            } catch (Exception e) {
//
//            }
//        }
//        long sum = 0;
//        if (l1.size() != 0) {
//            for (int i = 0; i < l1.size(); i++) {
//                sum += l1.get(i);
//            }
//        } else {
//            for (int i = 0; i < l2.size(); i++) {
//                sum += l2.get(i);
//            }
//        }
//        System.out.println(sum);
    }
}


