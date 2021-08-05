package Codeforces;

import java.util.Scanner;

public class Perfect_Team {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       m: while (t-->0){
            int c,m,x;
            c=sc.nextInt();
            m=sc.nextInt();
            x=sc.nextInt();
            if (c==0||m==0){
                System.out.println(0);
                continue;
            }
            long val=Math.min(c,m)-x;
            if (val<=0){
                System.out.println(Math.min(c,m));
            }else {
               int val1=Math.max(c,m);
               int val2=Math.min(c,m);
               int count=0;
               int i=0;
               while (true){
                   if ((val1/val2)==2||(val1<=1||val2<=1)){
                       System.out.println(count+Math.min(val1,val2));
                       continue m;
                   }
                   if (i%2==0){
                       val1--;
                       val2-=2;
                   }else {
                       val1-=2;
                       val2--;
                   }
                   count++;
                 //  System.out.println(val1+" "+val2+" "+count);
                   if (val1==0||val2==0){
                       break;
                   }
                   i++;
               }
                System.out.println(count+Math.min(val1,val2));
            }
        }
    }
}
