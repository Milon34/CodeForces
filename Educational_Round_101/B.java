package Contest_Practice.Educational_Round_101;

import java.util.Scanner;

public class B {
    public static int maxValue(int[] arr) {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
        //System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while ( t-- >0){
            int r=sc.nextInt();

            int sumR=0,sumB=0,maxR = 0,maxB=0;
            while (r-- >0){
                int rValue=sc.nextInt();
                sumR+=rValue;
                maxR=Math.max(maxR,sumR);
            }
            int b=sc.nextInt();
            while (b-- >0){
                int bValue=sc.nextInt();
                sumB+=bValue;
                maxB=Math.max(maxB,sumB);
            }
            System.out.println(maxR+maxB);

//            int arrR[]=new int[r];
//            for (int i=0;i<r;i++){
//                arrR[i]=sc.nextInt();
//            }
//            int b=sc.nextInt();
//            int arrB[]=new int[b];
//            for (int i=0;i<b;i++){
//                arrB[i]=sc.nextInt();
//
//            }
//            int fArray[]=new int[r+b];
//
////            List<Integer> l=new ArrayList<>();
////            if (arrR.length>arrB.length){
////                for (int i=0;i<r;i=i+2){
////
////
////                }
////            }
//            for (int i=0;i<arrR.length;i++){
//                fArray[i]=arrR[i];
//            }
//            for (int i=0;i<arrB.length;i++){
//                fArray[r+i]=arrB[i];
//            }
//
//            Arrays.sort(fArray);
////            if (arrR.length>arrB.length){
////                Arrays.sort(arrR);
////                int a=maxValue(arrR);
////                int bn=arrR[arrR.length-2];
////                int bnn=maxValue(arrB);
////                System.out.println(a+bn+bnn);
////            }else if (arrR.length<arrB.length){
////                Arrays.sort(arrB);
////                int a=maxValue(arrB);
////                int bn=arrB[arrB.length-2];
////                int bnn=maxValue(arrR);
////                System.out.println(a+bn+bnn);
////            }
//
//            int sum=0;
//            for (int i=fArray.length-1;i>0;i--){
//                if (fArray[i]>0){
//                    sum=sum+fArray[i];
//                }
//
//            }
//            System.out.println(sum);
////            System.out.println(fArray.length);
////            System.out.println(fArray.length);
////            for (int i:fArray){
////                System.out.print(i+" ");
////            }
////            System.out.println();
////            for (int i=0;i<(r+b);i++){
////                fArray[i]=
////            }

        }
    }
}
