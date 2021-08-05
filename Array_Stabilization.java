package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array_Stabilization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<n;i++){
                l.add(sc.nextInt());
            }
            Collections.sort(l);
            int min=Collections.min(l);
            System.out.println(Math.min(l.get(n-2)-min,l.get(n-1)-l.get(1)));
        }
    }

