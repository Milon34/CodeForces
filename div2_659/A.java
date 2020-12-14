package Contest_Practice.div2_659;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class A {
    static void sort(int[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i : a) {
            l.add(i);
        }
        Collections.sort(l);
        for (int i = 0; i < a.length; i++) {
            a[i] = l.get(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[105];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
//            sort(arr);
            String s[]=new String[51];
            for (int i=0;i<=50;i++){
                s[i]= "a";
            }

            for (String c:s){
                System.out.print(c+"");
            }
            System.out.println();
            for (int i=1;i<=n;i++){
                if (s[arr[i]].equals("a")){
                    s[arr[i]]="b";
                }else {
                    s[arr[i]]="a";
                }
                for (String c:s){
                    System.out.print(c+"");
                }
                System.out.println();
            }

//            for (int i = 0; i < n ; i++) {
//                   {
//                        if (arr[i]=='a'){
//
//                            arr[i]='b';
//                        }else {
//                            arr[i]='a';
//                        }
//                        for (char c:s ){
//                            System.out.print(c+"");
//                        }
//                       System.out.println();
//                        //System.out.print("a");
//                    }
////                System.out.println();
//            }
        }
    }
}
