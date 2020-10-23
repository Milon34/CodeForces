package Contest_Practice;

import java.util.Scanner;

public class Shovels_Swords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int count=0;
             if ((a==0) ||(b==0)) {
                 //System.out.println("0");
          }else {
                 for (int i = 0; (a > 1 || b > 1); i++) {
                     if (a > b) {
                         a = a - 2;
                         b = b - 1;
                         count++;
                     } else if (a == b) {
                         a = a - 2;
                         b = b - 1;
                         count++;

                     } else {
                         b = b - 2;
                         a = a - 1;
                         count++;
                     }
                 }
          }
            System.out.println(count);

        }

    }
}
