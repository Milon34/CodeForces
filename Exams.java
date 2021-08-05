package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

public class Exams {
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

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    //    public static final class Pair<T1, T2> {
//        public T1 first;
//        public T2 second;
//
//        public Pair() {
//            first = null;
//            second = null;
//        }
//
//        public Pair(T1 firstValue, T2 secondValue) {
//            first = firstValue;
//            second = secondValue;
//        }
//
//        public Pair(Pair<T1, T2> pair) {
//            first = pair.first;
//            second = pair.second;
//        }
//    }
    static class Pair {
        int first;
        int second;

        public Pair(int x, int y) {
            this.first = x;
            this.second = y;
        }
    }
    static void compare(Pair[] arr, int n) {
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.second - p2.second;
            }
        });
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.first - p2.first;
            }
        });
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        int val = t;
        Pair[] p = new Pair[val];
        HashSet<Integer>h=new HashSet<>();
        int[] arr=new int[val];
        int i = 0;
        while (t-- > 0) {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            h.add(n);
            p[i] = new Pair(n, m);
            arr[i]=m;
            i++;
        }
        // System.out.println(p[0].first + " " + p[0].second);
//        for (int m = 0; m < val; m++) {
//            System.out.println(p[m].first + " " + p[m].second);
//        }
        compare(p, val);
        // System.out.println(p[0].first+" "+p[0].second);
//        for (int m = 0; m < val; m++) {
//            System.out.println(p[m].first + " " + p[m].second);
//        }
        int res = 0;
        for (int m = 0; m < val; m++) {
            int x, y;
            x = p[m].first;
            y = p[m].second;
            if (y >= res) {
                res = y;
            } else {
                res = x;
            }
        }
            System.out.println(res);

        //  LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        // List<Pair<Integer, Integer>> lp = new ArrayList<>();
        // List<List<Integer>> lPair = new ArrayList<>();

//        int[] arr1 = new int[t];
//        int[] arr2 = new int[t];
//        int i = 0;
//        while (t-- > 0) {
//            int n, m;
//            n = sc.nextInt();
//            m = sc.nextInt();
//            // lPair.get(n).add(m);
//            lhm.put(n, m);
//            arr1[i] = n;
//            arr2[i] = m;
//            i++;
//        }
//        Arrays.sort(arr1);
//        //  System.out.println(lPair.get(0));
//        List<Integer> l = new ArrayList<>();
//        for (int m = 0; m < val; m++) {
//            l.add(lhm.get(arr1[m]));
//        }
//        List<Integer> revList = new ArrayList<>();
//        for (int m = l.size() - 1; m >= 0; m--) {
//            revList.add(l.get(m));
//        }
//        System.out.println(l);
        // System.out.println(lhm);
//        if (lhm.size() == 1) {
//            Arrays.sort(arr2);
//            System.out.println(arr2[val - 1]);
//        } else {
//            if (isSorted(l)) {
//                System.out.println(l.get(l.size() - 1));
//
//            } else {
//                System.out.println(arr1[arr1.length - 1]);
//            }
//        }

    }
}
