package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shaass_and_Oskols {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>l=new ArrayList<>();
        l.add(0);
        for (int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        l.add(0);
        int m=sc.nextInt();
        for (int i=1;i<=m;i++){
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            l.set(x-1,l.get(x-1)+y-1);
            l.set(x+1,l.get(x+1)+l.get(x)-y);
            l.set(x,0);
          ///  System.out.println(l);
        }
      //  System.out.println(l);
       for (int i=1;i<=n;i++){
           System.out.println(l.get(i));
       }
    }
}
