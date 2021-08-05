package Codeforces;

import java.util.*;

public class Sequence_Pair_Weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Long> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(sc.nextLong());
            }
            List<Long> list = new ArrayList<>();
            list.add(0l);
            long sum = 0;
            for (int i = 1; i < 1000005; i++) {
                sum += i;
                list.add(sum);
            }
            System.out.println(list);
            Set<Long> set = new HashSet<>(l);
            long sumVal = 0;
            for (Long r : set) {
                //System.out.println(Collections.frequency(l,r));
                if (Collections.frequency(l, r) > 1) {
                    sumVal += list.get(Collections.frequency(l, r));
                }
            }
            System.out.println(sumVal);
        }
    }
}
