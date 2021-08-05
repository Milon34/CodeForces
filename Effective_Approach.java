package Codeforces;

import java.util.*;

public class Effective_Approach {
    public static final class Pair<T1, T2> {
        public T1 first;
        public T2 second;

        public Pair() {
            first = null;
            second = null;
        }

        public Pair(T1 firstValue, T2 secondValue) {
            first = firstValue;
            second = secondValue;
        }

        public Pair(Pair<T1, T2> pair) {
            first = pair.first;
            second = pair.second;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       LinkedHashMap<Integer,Integer>l=new LinkedHashMap<Integer,Integer>();
        for (int i = 0; i < n; i++) {
            l.put(sc.nextInt(),i+1);
        }
       // System.out.println(l);
        int q = sc.nextInt();
        long sum1 = 0, sum2 = 0;
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            sum1 += l.get(a);
            sum2 += n-l.get(a)+1;
        }
        System.out.println(sum1 + " " + sum2);
    }
}

