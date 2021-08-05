package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Polycarp_Training {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++){
           l.add(sc.nextInt());
        }
        Collections.sort(l);
        int res=1;
        for (int i=0;i<n;i++){
            if (l.get(i)>=res){
                res++;
            }
        }
        System.out.println(res-1);
    }
}