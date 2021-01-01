package Contest_Practice.Educational_Round_100;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            int value = a + b + c;
            if (value%9==0) {
                if (Math.min(c, Math.min(a, b)) >= value / 9){
                    System.out.println("YES");}
                else{
                    System.out.println("NO");}
            }else {
                System.out.println("NO");
            }
//            if ((((a+b+c)/3)==a)||(((a+b+c)/3)==b)||(((a+b+c)/3)==c)){
//                if (a==1&&b==1&&c==1){
//                    System.out.println("NO");
//                }else{
//                System.out.println("YES");}
//            }else {
//                System.out.println("NO");
//            }
//        }
//        else {
//                for (int i = 0; i < ((n+1)/2)-1; i++) {
//                    System.out.print('2' + " 1" + " ");
//                }
//                System.out.print("2");
//            }
//            System.out.println();
//            if (arr.length=='2'){
//                for (int i=0;i<n;i++){
//                    System.out.print("1"+" ");
//                }
//            }else {
//
//            }

        }
    }
}

