package Contest_Practice.Div2_681;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            int j=1;
            for (int i=2*n;j<=n;j++,i=i+2){
                System.out.print(i+" ");
            }
        }
    }
}
