package Codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Fair_Playoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr=new int[4];
            List<Integer> l1=new ArrayList<>();
            List<Integer> l2=new ArrayList<>();
            for (int i=0;i<4;i++){
                int a=sc.nextInt();
                arr[i]=a;
                if (i<2){
                    l1.add(a);
                }else {
                    l2.add(a);
                }
            }
            Arrays.sort(arr);
            int val1 = arr[3];
            int val2 = arr[2];

           // System.out.println(l1);
            //System.out.println(l2);
            if ((l1.contains(val1)||l1.contains(val2))&&(l2.contains(val1)||l2.contains(val2))){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
