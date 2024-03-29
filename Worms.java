package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Worms {
    static class RealScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
    static int LowerBound(int a[], int x) {
        int l=-1,r=a.length;
        while(l+1<r) {
            int m=(l+r)>>>1;
            if(a[m]>=x) r=m;
            else l=m;
        }
        return r;
    }
    public static void main(String[] args) {
        RealScanner sc=new RealScanner();
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arrF=new int[n];
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int sum1=1,sum2=0,sum=0;
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            sum+=arr1[i];
            arrF[i]=sum;
//            if (i==0){
//                sum2 = arr1[0];
//                l1.add(sum1);
//                l2.add(sum2);
//            }else {
//                int val = sum2;
//                sum2 = sum2 + 1;
//                l1.add(sum2);
//                int loc = val + arr1[i];
//                sum2 = loc;
//                l2.add(loc);
//            }
        }
//        System.out.println(l1);
//        System.out.println(l2);
        System.out.println(Arrays.toString(arrF));
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for (int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
            System.out.println(LowerBound(arrF,arr2[i])+1);
        }
//        for (int i=0;i<arr2.length;i++){
//            int idx=0;
//            for (int j=0;j<l1.size();j++){
//                if (arr2[i]>=l1.get(j)&&arr2[i]<=l2.get(j)){
//                    idx=j+1;
//                    break;
//                }
//            }
//            System.out.println(idx);
//        }
    }
}
