package Codeforces;


import java.util.Scanner;

public class Prefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int count=0;
        for (int i = 0; i < s.length-1; i+=2) {
           if (s[i]==s[i+1]){
               count++;
               if (s[i]=='a'){
                   s[i]='b';
               }else {
                   s[i]='a';
               }
           }
        }
        System.out.println(count);
        String myS= String.valueOf(s);
        System.out.println(myS);
//        int val =Math.max(countA,countB)-Math.min(countA,countB);
//        System.out.println(val/2);
//        if (countA<countB) {
//            if (countB%2!=0) {
//                for (int i = 0; i < countB-1; i += 2) {
//                    if (s[i] == 'b') {
//                        s[i] = 'a';
//                    }
//                }
//            }else {
//                for (int i = 0; i < countB; i += 2) {
//                    if (s[i] == 'b') {
//                        s[i] = 'a';
//                    }
//                }
//            }
//            String myS= String.valueOf(s);
//            System.out.println(myS);
//        }else if (countA>countB){
//            if (countA%2!=0) {
//                for (int i = 0; i < countA-1; i += 2) {
//                    if (s[i] == 'a') {
//                        s[i] = 'b';
//                    }
//                }
//            }else {
//                for (int i = 0; i < countA; i += 2) {
//                    if (s[i] == 'a') {
//                        s[i] = 'b';
//                    }
//                }
//            }
//            String myS= String.valueOf(s);
//            System.out.println(myS);
//        }else {
//            String myS= String.valueOf(s);
//            System.out.println(myS);
//        }

    }
}
