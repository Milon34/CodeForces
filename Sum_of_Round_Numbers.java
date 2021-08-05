package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum_of_Round_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            String s = String.valueOf(n);
            int per = 1;
            List<Long> l = new ArrayList<>();
            long sum = 0;
            for (long i = s.length() - 1; i >= 1; i--) {
                long val = s.charAt((int) i) - '0';
                if (val != 0) {
                    long value = val * per;
                    sum += value;
                    l.add(value);
                }
                per *= 10;
            }
            if (l.size() == 0) {
                System.out.println(1);
                System.out.println(n);
                continue;
            }
            System.out.println(l.size() + 1);
            for (long i:l){
                System.out.print(i+" ");
            }
            System.out.println(n-sum);

        }
    }
}
