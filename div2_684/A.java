package Contest_Practice.div2_684;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, c0, c1, h;
            n = sc.nextInt();
            c0 = sc.nextInt();
            c1 = sc.nextInt();
            h = sc.nextInt();
            String s;
            s = sc.next();

            int count1=0,count2=0;
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)=='0'){
                    count1++;
                }else {
                    count2++;
                }
            }
            int min1,sum1;
            if (c0<c1){
                if (count1==n){
                    min1=c0*n;
                }else {
                    min1=Math.min(c0*n+h*count2, c0*count1+c1*count2);
                }
            }else {
                if (count2==n){
                    min1=c1*n;
                }else {
                    min1=Math.min(c1*n+h*count1, c0*count1+c1*count2);
                }
            }
            System.out.println(min1);
//            int count1 = 0;
//            int count2 = 0;
//
//
//            if (n > h) {
//                if (c0 <= c1) {
//                    for (int i = 0; i < s.length(); i++) {
//
//                        if (s.charAt(i) == '1') {
//                            count1++;
//                        }
//                    }
//                } else {
//
//                    for (int i = 0; i < s.length(); i++) {
//                        if (s.charAt(i) == '0') {
//                            count2++;
//                        }
//                    }
//                }
//            }
//
//            if (c0 < c1) {
//                System.out.println((n * c0) + count1);
//            } else {
//                System.out.println((n * c1) + count2);
//            }
//            if (n < h) {
//                int bCount1 = 0;
//                int bCount2 = 0;
//                if (c0<=c1){
//                    for (int i=0;i<s.length();i++){
//                        if (s.charAt(i)=='1'){
//                            bCount1++;
//                        }
//                    }
//                }else {
//                    for (int i = 0; i < s.length(); i++) {
//                        if (s.charAt(i) == '0') {
//                            count2++;//bCount2
//                        }
//                    }
//                }
//                if (c0<c1){
//                    System.out.println((n*h)+bCount1);
//                }else {
//                    System.out.println((n*h)+bCount2);
//                }
//            }
//        }
        }
    }
}
