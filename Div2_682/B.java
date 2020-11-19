package Contest_Practice.Div2_682;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int b;
            int n = sc.nextInt();

            HashSet<Integer> s=new HashSet<>();
            for (int i = 0; i < n; i++) {
                b = sc.nextInt();
                s.add(b);

            }
           if (s.size()<n){
               System.out.println("YES");
           }else {
               System.out.println("NO");
           }
        }

    }
}

//            int arr[] = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//            int[] fArray = new int[n];
//            for (int i = 0; i < n; i++) {
//                fArray[i] = (int) Math.pow(2, arr[i]);
//            }
//
//            int result = 0;
//            Arrays.sort(fArray);
////            for (int s:fArray) {
////                System.out.print(s + " ");
////            }
//            for (int i = 0; i < fArray.length-1; i++) {
//                result = result + fArray[i];
//            }
//            if (result == fArray[n - 1]) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }


