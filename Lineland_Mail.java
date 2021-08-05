package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Lineland_Mail {
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

    public static void main(String[] args) {
        RealScanner sc=new RealScanner();
        long n=sc.nextLong();
        List<Long> l=new ArrayList<>();
        for (long i=0;i<n;i++){
            l.add(sc.nextLong());
        }
        long arr1[]=new long[(int) n];
        long arr2[]=new long[(int) n];
        arr1[0]=l.get(1)-l.get(0);
        arr2[0]=l.get(l.size()-1)-l.get(0);
        for (long i=1;i<n-1;i++){
//            if (l.get((int) i)<=0) {
//                arr1[(int) i]=l.get((int) i)-l.get((int) (i-1));
//                arr2[(int) i] =(-1*l.get((int) i))+l.get(l.size()-1);
//            }else {
//                try {
//                    arr1[(int) i] = l.get((int) i + 1) - l.get((int) (i));
//                    arr2[(int) i] = (l.get((int) l.size()-1)) - l.get((int) i);
//                }catch (Exception e){
//
//                }
//            }
            arr1[(int) i]=Math.min((l.get((int) (i+1))-l.get((int) i)),(l.get((int) i)-l.get((int) (i-1))));
            arr2[(int) i]=Math.max((l.get((int) i)-l.get(0)),(l.get((int) (n-1))-l.get((int) i)));

        }
        arr1[(int) (n-1)]=l.get((int) (n-1))-l.get((int) (n-2));
        arr2[(int) (n-1)]=l.get((int) (n-1))-l.get(0);
        for (long i=0;i<n;i++){
            System.out.print(arr1[(int) i]+" ");
            System.out.println(arr2[(int) i]);
        }
    }
}
