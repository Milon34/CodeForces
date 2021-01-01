package Contest_Practice.ICPC;

import java.util.Arrays;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--  >0){

            int arr[]=new int[4];
            for (int i=0;i<4;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[0]*arr[2]);
//            int a1,a2,a3,a4;
//            a1=sc.nextInt();
//            a2=sc.nextInt();
//            a3=sc.nextInt();
//            a4=sc.nextInt();
////            if ((a1==a3&&a2==a4)||(a2==a3&&a1==a4)||(a1==a2||a3==a4)){
////                System.out.println(a1*a3);
////
////            }
//
//             if (a1<a3&&a2==a4){
//                while (a1!=a3){
//
//                    if (a1==a3){
//                        break;
//                    }
//                    a3--;
//                }
//
//            }
//            else if  (a1<a3&& a3<a4&&a1==a3){
//                while (a3!=a4){
//
////                    System.out.println(a3);
//                    if (a3==a4){
//                        break;
//                    }
//                    a4--;
//                }
//                if (a1<a2) {
//                    while (a1 != a2) {
//
//                        if (a1==a2){
//                            break;
//                        }
//                        a2--;
//                    }
//                }
//            }
////            if (a1<a3 &&a2==a4){
////                while (a1!=a3){
////                    a3--;
////                    if (a1==a3){
////                        break;
////                    }
////                }
////            }
////            if (a2<a4){
////                while (a2!=a4){
////                    a4--;
////                    if (a2==a4){
////                        break;
////                    }
////                }
////            }else {
////                while (a2!=a4){
////                    a4--;
////                    if (a2==a4){
////                        break;
////                    }
////                }
////            }
//            if (a1!=a3){
//                System.out.println(a1*a3);
//            }else if(a2==a4){
//                System.out.println(a2*a3);
//            }else if (a1==a2){
//                System.out.println(a2*a3);
//            }
////            System.out.println(a1*a3);
        }
    }
}
