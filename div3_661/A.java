package Contest_Practice.div3_661;

import java.util.*;

public class A {
    public static void countFreq(Integer[] arr, int n) {

        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

    public static boolean areSame(Integer arr[]) {
        Set<Integer> s = new HashSet<>(Arrays.asList(arr));
        return (s.size() == 1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        Integer arr[]=new Integer[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       countFreq(arr,arr.length);

        Arrays.sort(arr);
        if (areSame(arr)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }




//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
////            Vector<Integer> l = new Vector<>();
//            int arr[] = new int[n];
//
//            for (int i = 0; i < n; i++) {
////                l.add(sc.nextInt());
//                arr[i] = sc.nextInt();
//            }
//            Arrays.sort(arr);
//            boolean ok=false;
//            for (int i=1;i<n;i++){
//                if (arr[i]-arr[i-1]>1){
//                    ok=true;
//                }
//            }
//            if (ok){
//                System.out.println("NO");
//            }else {
//                System.out.println("YES");
//            }


//            if (arr.length == 1) {
//                System.out.println("YES");
//            } else {
//                Integer s[] = new Integer[arr.length - 1];
//                Vector<Integer> v = new Vector<>();
//                for (int i = 0; i < arr.length - 1; i++) {
//                    s[i] = arr[i+1];
////                    v.add(arr[i]);
//                }
//                for (Integer sj:s){
//                    System.out.print(sj+" ");
//                }
//                System.out.println();
//                if (areSame(s)) {
//                    System.out.println("YES");
//                } else {
//                    System.out.println("NO");
//                }
            }
        }


//class Bool{
//    public static void main(String[] args) {
//        int res=0;
//        Boolean b1=new Boolean("TRUE");
//        Boolean b2=new Boolean("true");
//        Boolean b3=new Boolean("tRuE");
//        Boolean b4=new Boolean("false");
//        if (b1==b2){
//            res=1;
//        }
//        if (b1.equals(b2)){//
//            res=res+10;
//        }
//        if (b2==b4){
//            res=res+100;
//        }
//        if (b2.equals(b4)){
//            res=res+1000;
//        }
//        if (b2.equals(b3)){//
//            res=res+10000;
//        }
//        System.out.println(res);
//    }
//}