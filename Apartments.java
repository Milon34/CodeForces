package Codeforces;

import java.util.*;

public class Apartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, k;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            l2.add(sc.nextInt());
        }
        Collections.sort(l1);
        Collections.sort(l2);
        int i = 0, j = 0, count = 0;
        while (i < n && j < m) {
            if (Math.abs(l1.get(i) - l2.get(j)) <= k) {
                i++;
                j++;
                count++;
            } else {
                if (l1.get(i) - l2.get(j) > k) {
                    j++;
                } else {
                    i++;
                }
            }
        }
        System.out.println(count);
    }
}
