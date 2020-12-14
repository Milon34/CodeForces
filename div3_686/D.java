package Contest_Practice.div3_686;

import java.util.Scanner;
//import java.util.Vector;

public class D {
    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n;
            n = sc.nextLong();
            long kValue = n;

//            if (isPrime(n)||n%2==1){
//                System.out.println(1);
//                System.out.println(n);
//            }else {
            long max_cnt = 1, count, temp = 0;
            for (long i = 2; i * i <= kValue; ++i) {
                count = 0;
                while (kValue % i == 0) {
                    kValue /= i;
                    count++;
                }
                if (count > max_cnt) {
                    max_cnt = count;
                    temp = i;
                }
            }
            System.out.println(max_cnt);
            for (int i = 1; i < max_cnt; i++) {
                System.out.print(temp + " ");
                n /= temp;
            }
            System.out.println(n);


        }
    }
}

