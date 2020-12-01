package Contest_Practice.EducationalRound_99;

import java.util.Scanner;

public class C {
    public static int maxValue(int[] arr) {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int powCalculateLogN(int num1, int num2) {  //////num1^num2
        int res = 1;
        while (num2 > 0) {
            if ((num2 & 1) == 1) {
                res = res * num1;
            }
            num2 = num2 >> 1;
            num1 = num1 * num1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println((x-1)+" "+y);
        }
    }
}
