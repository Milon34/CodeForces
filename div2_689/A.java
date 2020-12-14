package Contest_Practice.div2_689;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
//            char[] c=new char[n];
            for ( int i=0;i<n;i++){
                System.out.print((char)('a'+(i%3)));
            }
            System.out.println();

        }
    }
}
