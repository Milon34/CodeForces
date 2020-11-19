package Contest_Practice.Educational_Round_90;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int t=sc.nextInt();
        while ( t-- >0){
            long a,b,c;
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            if (a<c){
                System.out.print(1+" ");
            }else {
                System.out.print(-1+" ");
            }
            if (c<a*b){
                System.out.print(b+" ");
            }else {
                System.out.print(-1+" ");
            }
            System.out.println();
        }
    }
}
