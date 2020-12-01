package Contest_Practice.div2_647;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            long a,b;
            a=sc.nextLong();
            b=sc.nextLong();
            int count=0;
            if (a<=b){
                long temp=b;
                b=a;
                a=temp;
            }
            while (a>b){
                if (b*8<=a){
                    b*=8;
                }else if (b*4<=a){
                    b*=4;
                }else {
                    b*=2;
                }
                count++;
            }
            if (a==b){
                System.out.println(count);
            }else {
                System.out.println("-1");
            }
        }
    }
}
