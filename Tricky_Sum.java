package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tricky_Sum {
    public static void main(String[] args) {
        List<Long> l = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            l.add((long) Math.pow(2, i));
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long pow = 1,sum=0;
            while (pow<=n){
                sum-=pow*2;
                pow*=2;
            }
            System.out.println(sum);
        }
    }
}
