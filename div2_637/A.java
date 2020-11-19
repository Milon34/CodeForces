package Contest_Practice.div2_637;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n,a,b,c,d;
            n=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            int maxIn=n*(a+b);
            int maxUp=n*(a-b);
            if (maxIn<(c-d)|| maxUp>(c+d)){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }
}
