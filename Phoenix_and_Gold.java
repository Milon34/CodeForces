package Codeforces;

import java.util.*;

public class Phoenix_and_Gold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            List<Integer> l = new ArrayList<>();
            int sum = 0;
            int idx = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum == k) {
                    idx = i;
                } else {
                    l.add(arr[i]);
                }
            }

            if (l.size()!=n){
                l.add(arr[idx]);
            }
           // System.out.println(l);
            boolean check = true;
            int pro = 0;
            for (int i = 0; i < l.size(); i++) {
                pro+=l.get(i);
                if (pro==k){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.println("YES");
                for (int i:l){
                    System.out.print(i+" ");
                }
                System.out.println();
            }else {
                System.out.println("NO");
            }

        }
    }
}