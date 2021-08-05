package Codeforces;

import java.util.Scanner;
public class Letters {
    static long lowerBound(long a[], long x) { // x is the target value
        long l = -1, r = a.length;
        while (l + 1 < r) {
            long m = (l + r) >>> 1;
            if (a[(int) m] >= x) r = m;
            else l = m;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, m;
        n = sc.nextLong();
        m = sc.nextLong();
        long[] arr= new long[(int) m];
        long val=0;
        long[] ar=new long[(int) n];
        for (long i = 0; i < n; i++) {
            long x=sc.nextLong();
            val+=x;
            ar[(int) i]=val;
        }
        for (long i = 0; i < m; i++) {
            arr[(int) i] = sc.nextLong();
        }
       // Arrays.sort(arr1);
        for (long i = 0; i < m; i++) {
          //  System.out.println(LowerBound(ar,arr2[i]));
            if (lowerBound(ar,arr[(int) i])==0){
                System.out.println(lowerBound(ar,arr[(int) i])+1+" "+arr[(int) i]);
            }else {
                System.out.println(lowerBound(ar,arr[(int) i])+1+" "+(arr[(int) i]-ar[(int) (lowerBound(ar,arr[(int) i])-1)]));
            }
        }
    }
}
