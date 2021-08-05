package Codeforces;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mislove_Has_Lost_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        for (int i = 1; i < Math.max(a, b); i++) {
            l.add((int) Math.pow(2, i));
        }
        int max = Collections.max(l);
        int maxSum = 0;
        for (int i = 0; i < l.size(); i++) {
            maxSum += l.get(i);
        }
        for (int i=0;i<n-l.size();i++){
            maxSum+=max;
        }
        int minSum=0;
        for (int i=0;i<Math.min(a,b);i++){
            minSum+=l.get(i);
        }
        for (int i=0;i<n-Math.min(a,b);i++){
            minSum+=1;
        }
        System.out.println(minSum+" "+maxSum);
    }
}
