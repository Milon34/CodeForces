package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Queue {
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
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        int max=l.get(l.size()-1);
                                   //This is First Way..attempted
//        try {
//            int temp = l.get(l.size() - 1);
//            l.set(l.size() - 1, l.get(l.size() - 2));
//            l.set(l.size() - 2, temp);
//        } catch (Exception e) {
//
//        }
      //  System.out.println(l);

        long res = 0, sum =0,serve=0;
        for (int i = 0; i < n; i++) {
//            sum += l.get(i-1);
//            if (sum > l.get(i)) {
//                if (sum<=max){   //this is second way.. attempted
//                    res++;
//                }
//                break;
//            }
//            res=i+1;
            if(serve<=l.get(i)){
                res++;
            }else {
                continue;
            }
            serve+=l.get(i);
        }
        System.out.println(res);
    }
}
