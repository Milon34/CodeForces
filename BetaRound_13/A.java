package Contest_Practice.BetaRound_13;

import java.util.Scanner;

public class A {
    public static int GCDCalculate(int num1, int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;

            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for (int i=2;i<n;i++){
            int x=i,s=n;
            while (s!=0) {
                sum += s % x;
                s /= x;
            }
        }
        int x=n-2;
        int gcd_Value=GCDCalculate(sum,x);
        x/=gcd_Value;
        sum/=gcd_Value;
        System.out.println(sum+"/"+x);
    }
}
