package Contest_Practice.Div2_678;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int arr[]=new int[a];
            for (int i=0;i<a;i++){
                arr[i]=sc.nextInt();

            }
            Arrays.sort(arr);
            int count=0,res;
            for (int i=0;i<arr.length;i++){
                for (int j=i;j<arr.length;j++){

                    if (arr[j]!=0){
                        count=count+arr[j];
                    }else {
                        count=0;
                    }
//                        res=(arr[j]/(j+1));
//                        count=(count+res);
                    }
                break;

                }
//            System.out.println(count);
            if ((count)==b){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
