package Codeforces;

import java.util.*;

public class Array_Reodering {
    public static long gcdAlgorithm(long n1, long n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdAlgorithm(n2, n1 % n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Long[] arr = new Long[n];
            for (long i = 0; i < n; i++) {
                arr[(int) i] = sc.nextLong();
            }
            List<Long> l1=new ArrayList<>();
            List<Long> l2=new ArrayList<>();
            for (int i=0;i<arr.length;i++){
                if (arr[i]%2==0){
                   l1.add(arr[i]);
                }else {
                    l2.add(arr[i]);
                }
            }
            long[] my=new long[n];
            List<Long> per=new ArrayList<>();
            per.addAll(l1);
            per.addAll(l2);
            for (long i=0;i<n;i++){
                my[(int) i]=per.get((int) i);
            }
            long count = 0;
            for (long i = 0; i < n; i++) {
                for (long j = i + 1; j < n; j++) {
                    if (gcdAlgorithm(my[(int) i], (long) 2 * my[(int) j]) > 1) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}