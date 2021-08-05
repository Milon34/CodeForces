package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Noldbach_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        for (int i=2;i<=a;i++){
            BigInteger big=new BigInteger(String.valueOf(i));
            if (big.isProbablePrime(1)){
                count++;
            }
        }
        System.out.println(count);
        if (count>=b){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
