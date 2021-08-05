package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Red_and_Blue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int m = sc.nextInt();
            int sum = 0;
            List<Integer> l1 = new ArrayList<>();
           // int max1=0,max2=0;
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                sum+=a;
               // max1=Math.max(sum,max1);
                l1.add(sum);
            }
            sum=0;
            int n = sc.nextInt();
            List<Integer> l2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                sum+=a;
                //max2=Math.max(sum,max2);
                l2.add(sum);

            }
            int val1=Collections.max(l1);
            int val2=Collections.max(l2);
            if (val1<0&&val2<0){
                System.out.println(0);
            }else if (val1<0){
                System.out.println(val2);
            }else if (val2<0){
                System.out.println(val1);
            }else {
                System.out.println(val1+val2);
            }
           // System.out.println(max1+max2);

        }
    }
}
