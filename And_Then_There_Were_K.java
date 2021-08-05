package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class And_Then_There_Were_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            l.add((int) Math.pow(2, i));
        }
       // System.out.println(l);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int count = 0;
            for (int i = 0; i < l.size(); i++) {
                if (n <l.get(i)) {
                   break;
                }
                count++;

            }
            System.out.println((int) Math.pow(2,count-1)-1);
        }
    }
}

//class testdkdk {
//    public static void main(String[] args) {
//        System.out.println(64 & 63);
//    }
//}