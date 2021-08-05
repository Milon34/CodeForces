package Codeforces;

import java.util.Scanner;

public class Game_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int count = 0;
        boolean check = true;
        if (m == n) {
            System.out.println(0);
            return;
        } else {
            while (m > n) {
//                if (m % 2 == 0) {
//                    count++;
//                    m /= 2;
//                }else {
//                    n*=2;
//                    count++;
//                    if (n==m){
//                        check=true;
//                        break;
//                    }
//                }
                long val = m / n;
                if (n * val != m) {
                    check = false;
                    break;
                }

                if (val % 2 == 0) {
                    n *= 2;
                    count++;
                    continue;
                }
                if (val % 3 == 0) {
                    n *= 3;
                    count++;
                    continue;
                }
                check = false;
                break;
//                if (m == n) {
//                    check = true;
//                    break;
//                }

//                if (m % 3 == 0) {
//                    count++;
//                    m /= 3;
//                }else {
//                    n*=3;
//                    count++;
//                    if (n==m){
//                        check=true;
//                        break;
//                    }
//                }
//                if (m == n) {
//                    check = true;
//                    break;
//                }
//            }
            }
            if (check) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
        }
    }
}
