package Contest_Practice;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-- >0){
            int a=sc.nextInt();
            int count=0;
            for (int i=0;i<a;i++) {
                if (a % 6 == 0) {
                    count++;
                } else if (a%6!=0){
                    a =a*2;
                    count++;
                }else {
                    System.out.println("-1");
                }
            }
            System.out.println(count);
        }
    }
}
