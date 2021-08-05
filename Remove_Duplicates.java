package Codeforces;

import java.util.*;

public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> h=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            h.add(a);
            l.add(a);
        }

        List<Integer> per=new ArrayList<>();
        per.addAll(h);
        System.out.println(per);
        HashSet<Integer> pre=new HashSet<>();

        for (int i=0;i<l.size();i++){

        }

    }
}
class Hello{
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>();
        t.add(1);
        t.add(3);
        t.add(4);
        t.add(3);
        t.add(2);
        t.add(5);
        System.out.println(t);
    }
}