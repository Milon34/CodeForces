package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class Distinct_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer>h=new HashSet<>();
        for (int i=0;i<n;i++){
            h.add(sc.nextInt());
        }
        System.out.println(h.size());
    }
}
