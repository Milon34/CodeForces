package Codeforces;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class T_primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for (int i=2;i<=n;i++){
            for (int j=2;j<=i;j++){
                BigInteger b=new BigInteger(String.valueOf(j));
                if (b.isProbablePrime(3)){
                    BigInteger per=b.nextProbablePrime();
                    if (per.compareTo(BigInteger.valueOf(n))<0||per.compareTo(BigInteger.valueOf(n))==0){
                    count++;
                    break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

class BigTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger[] b = new BigInteger[6];
        Arrays.fill(b,new BigInteger(String.valueOf(1)));
        int i = 0;
//        for (int j = 0; j < 6; j++) {
//            b[j] = BigInteger.valueOf(1);
//        }
        while (i <= 5) {
            BigInteger val = b[i];
            val = val.add(BigInteger.ONE);
            b[i] = val;
            i++;
        }
        for (int j = 0; j < b.length; j++) {
            System.out.println(b[j]);
        }
    }
}