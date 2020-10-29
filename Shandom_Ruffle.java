package Contest_Practice;

import java.util.Scanner;
import java.util.Vector;

public class Shandom_Ruffle {
//   public static void shandom_ruffle(int a, int b, int[] array) {
//        int bStart=b;
//        while (a<bStart && b<=array.length) {
//           array[a]=array[b];
//            a++;
//            b++;
//            System.out.println(a +" "+b);
//        }
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[t];
         for (int i=0;i<t;i++){
           int a,b;
           a=sc.nextInt();
           b=sc.nextInt();

           for (int j=1;j<=t;j++){
               System.out.print(j+" ");

           }
             break;
        }
    }
}
class testVec{
    public static void main(String[] args) {
        Vector <Integer>v=new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        Integer arr[]=new Integer[v.size()];
        v.toArray(arr);
        System.out.println(arr.length);
        for (int i=arr.length/2;i<v.size();i++){

            System.out.println(arr[i]);
        }
    }
}