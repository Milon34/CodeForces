package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Valera_and_Antique_Items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            List<Integer> myL = new ArrayList<>();
            for (int m = 0; m < a; m++) {
                myL.add(sc.nextInt());
            }
            Collections.sort(myL);
            if (myL.get(0)<k){
                l.add(i+1);
            }
        }
        System.out.println(l.size());
        for (int i:l){
            System.out.print(i+" ");
        }
    }
}
