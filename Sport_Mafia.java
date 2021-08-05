package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sport_Mafia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        // List<Long> l = new ArrayList<>();
        long sum = 0;
//        for (int i=1;i<=n;i++){
//            sum+=i;
//            l.add(sum);
//        }
//         System.out.println(l);
//        long val = 0;
//        for (int i = 1; i <= n; i++) {
//            if (((i * (i + 1)) / 2) - (n - i) == k) {
//              //  System.out.println(n - i);
//                val = n - i;
//                break;
//            }
//        }
        long l = -1, r = n + 1;  //binary search
        while (r - l > 1) {
            long m = (l + r) / 2;
            if ((n - m) * (n - m + 1) / 2 - m > k)
                l = m;
            else
                r = m;
        }
        System.out.println(r);
        //  System.out.println(l);
    }
}
