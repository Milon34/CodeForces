package Contest_Practice.div2_687;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,m,r,c;
            n=sc.nextInt();
            m=sc.nextInt();
            r=sc.nextInt();
            c=sc.nextInt();
            long max=0;
            max = Math.max(max, c-1+r-1);
            max = Math.max(max, n-r+c-1);
            max = Math.max(max, n-r+m-c);
            max = Math.max(max, r-1+m-c);
            System.out.println(max);
        }
    }
}
