package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Equalize_Prices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            List<Integer> l=new ArrayList<>();
            for (int i=0;i<n;i++){
                l.add(sc.nextInt());
            }
            int val= Collections.max(l);
            Collections.sort(l);
            if (Math.abs(val-(k+l.get(0)))<=k){
                System.out.println(k+l.get(0));
            }else {
                System.out.println(-1);
            }
        }
    }
}
