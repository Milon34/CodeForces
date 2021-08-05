package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jzzhu_and_Sequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        a = sc.nextLong();
        b = sc.nextLong();
        long x = sc.nextLong();
        long res = b - a;
        List<Long> l = new ArrayList<>();
        l.add(b);
        l.add(res);
        int k=1;
        for (int i = 3; i < 8; i++) {
            l.add(l.get(k)-l.get(k-1));
            k++;
        }
        l.remove(0);
       // System.out.println(l);
        if (l.get((int) (x%6))<=0){
            System.out.println(Math.abs(l.get((int) (x%6)))%1000000007);
        }else {
            if ((1000000007-l.get((int) (x%6))%1000000007)==1000000007){
                System.out.println(0);
                return;
            }
            System.out.println(1000000007-l.get((int) (x%6))%1000000007);
        }
    }
}
