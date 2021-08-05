package Codeforces;

import java.util.*;

public class Jzzhu_and_Children {
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
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        List<Pair<Integer, Integer>> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            l.add(new Pair(a, (int) Math.ceil((double) a / k)));
        }
        List<Integer> myL = new ArrayList<>();
        Iterator<Pair<Integer, Integer>> itr = l.iterator();
        while (itr.hasNext()) {
            myL.add(itr.next().second);
        }
        int max = Collections.max(myL);
        System.out.println(myL.lastIndexOf(max) + 1);

    }
}