package Codeforces;

import java.util.*;
import java.util.stream.Collectors;

public class Yet_Another_Meme_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a, b;
            a = sc.nextLong();
            b = sc.nextLong();
             System.out.println(a*(String.valueOf(b+1).length()-1));
//            List<Integer> l1 = new ArrayList<>();
//            List<Integer> l2 = new ArrayList<>();
//            for (int i = 1; i <= 1000; i++) {
//                l1.add(i);
//                l2.add(i);
//            }
//            int count = 0;
//            LinkedHashMap<Integer, Integer> m = new LinkedHashMap<>();
//            for (int i = 1; i <= 100; i++) {
//                for (int j = 1; j <= 100; j++) {
//                    String s1 = String.valueOf(i);
//                    String s2 = String.valueOf(j);
//                    String s = s1 + s2;
//                    int val = (i * j) + (i + j);
//                    String sVal = String.valueOf(val);
//                    if (s.equals(sVal)) {
//                        count++;
//                        System.out.println(i+" "+j);
//                    }
//                }
//            }
        }
    }
}
