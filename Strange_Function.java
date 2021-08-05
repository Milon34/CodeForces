package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Strange_Function {
    static List<Long> l = new ArrayList<>();

    //    static void s(int n) {
//        boolean[] prime = new boolean[n + 1];
//        for (int i = 0; i <= n; i++)
//            prime[i] = true;
//        for (int p = 2; p * p <= n; p++) {
//            if (prime[p]) {
//                for (int i = p * p; i <= n; i += p)
//                    prime[i] = false;
//            }
//        }
//        for (long i = 3; i <= n; i++) {
//            if (prime[(int) i])
//                l.add(i);
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            // int i=1;
            // System.out.println(l);
            long sum = 0;
//            for (int i = 1; i <= n; i++) {
//                if (i % 2 != 0) {
//                    sum += 2;
//                }
//            }
            if (n%2!=0){
                sum+=3;
            }else if (n%3==0){
                if (n%5==0){
                    sum+=7;
                }else {
                    sum+=5;
                }
            }
            System.out.println(sum);
        }
    }
}
