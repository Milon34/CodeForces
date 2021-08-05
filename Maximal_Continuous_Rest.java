package Codeforces;

import java.util.*;

public class Maximal_Continuous_Rest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[(int) (2* n)];
        List<Long> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(arr));
        int a=arr.length/2;
        for (int i = 0; i < n; i++) {
            arr[a]=arr[i];
            a++;
        }
        long count = 0, res = 0;
        for (int i = 0; i < 2 * n; i++) {
            if ( arr[i]== 1) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 0;
            }
        }
        System.out.println(res);
    }
}

class te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> l = new ArrayList<>();
        int count = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
            l.add(count);
        }
        int val = Collections.max(l);

        if (arr[0] == 1 && arr[arr.length - 1] == 1) {
            System.out.println(val + 1);
        } else {
            System.out.println(val);
        }
    }
}