package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jeff_and_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       List<Integer> l=new ArrayList<>();
       int count5=0,count0=0;
       int sum=0;
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            if (a==5){
                count5++;
                sum+=a;
            }else {
                count0++;
            }
           l.add(a);
        }
        count5-=count5%9;
        if (count0==0){
            System.out.println(-1);
            return;
        }else if (count5==0){
            System.out.println(0);
            return;
        }
        for (int i=0;i<count5;i++){
            System.out.print(5);
        }
        for (int i=0;i<count0;i++){
            System.out.print(0);
        }
    }
}
