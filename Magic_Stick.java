package Codeforces;

import java.util.Scanner;

public class Magic_Stick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if (x > y) {
                System.out.println("YES");
                continue;
            }
            if (x==y){
                System.out.println("YES");
                continue;
            }
           if (x>3){
               System.out.println("YES");
           }else if (x==1){
               if (y==1){
                   System.out.println("YSE");
               }else {
                   System.out.println("NO");
               }
           }else{
               if (y<=3){
                   System.out.println("YES");
               }else {
                   System.out.println("NO");
               }
           }
        }
    }
}
