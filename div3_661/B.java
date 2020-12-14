package Contest_Practice.div3_661;

import java.util.Scanner;

public class B {
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while ( t-- >0){
            int n=sc.nextInt();
            int arrA[]=new int[n];
            int arrB[]=new int[n];
            for (int i=0;i<n;i++){
                arrA[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                arrB[i]=sc.nextInt();
            }
            long max=0;
//            Arrays.sort(arrA);
//            Arrays.sort(arrB);
            int value1=getMin(arrA);
            int value2=getMin(arrB);
            for (int i=0;i<n;i++){
                max+=Math.max((arrA[i]-value1),(arrB[i]-value2));
            }
            System.out.println(max);
        }
    }
}
