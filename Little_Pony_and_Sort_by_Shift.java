package Codeforces;

import java.util.*;

public class Little_Pony_and_Sort_by_Shift {
    static boolean is(Integer arr[], int n) {
        if (n == 0 || n == 1)
            return true;
        for (int i = 1; i < n; i++)
            if (arr[i - 1] > arr[i])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        Integer[] arr = new Integer[n];
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            h.add(a);
            v.add(a);
        }
        int count = 0;
        int idx = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
                idx = i;
            }
        }
        if (count > 1) {
            System.out.println(-1);
        } else {
            int ans = -1;
            if (count == 0) {
               ans=0;
            } else if (arr[n - 1] <= arr[0]) {
                ans = n - idx;
            }
            System.out.println(ans);
        }
//                int max = Collections.max(v);
//                int min = Collections.min(v);
//                if (last == min) {
//                    System.out.println(min);
//                } else if (arr[0].equals(max)) {
//                    System.out.println(max);
//                } else {
//                    System.out.println(ans);
//                }
            }
        }
//        int min=Collections.min(h);
//        List<Integer> a=v.subList(0,n-1);
//        Integer[] arraySub=a.toArray(new Integer[0]);
//        if (min==arr[n-1]&&(is(arraySub,arraySub.length))){
//            System.out.println(1);
//        }else if (is(arr,n)){
//            System.out.println(0);
//        }else {
//            if (h.size() == 2) {
//                if (is(arr, n)) {
//                    System.out.println(0);
//                } else {
//                    System.out.println(1);
//                }
//            } else {
//                System.out.println(-1);
//            }
//        }


