package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Card_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n,a,b;
            n=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            List<Integer> l1=new ArrayList<>();
            List<Integer> l2=new ArrayList<>();
            for (int i=0;i<a;i++){
                l1.add(sc.nextInt());
            }
            for (int i=0;i<b;i++){
                l2.add(sc.nextInt());
            }
            if (l1.contains(n)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
