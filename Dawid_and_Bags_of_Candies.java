package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dawid_and_Bags_of_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        if (l.get(0)+l.get(l.size()-1)==l.get(1)+l.get(2)||l.get(0)+l.get(1)+l.get(2)==l.get(3)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
