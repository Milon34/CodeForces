package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Persuit {
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
        int t=sc.nextInt();
        while (t-->0){
            long n;
            n=sc.nextLong();
            Long [] a=new Long[(int) n];
            Long [] b=new Long[(int) n];
            for(long i=0;i<n;i++){
             a[(int) i]=sc.nextLong();
            }
            for(long i=0;i<n;i++){
               b[(int) i]=sc.nextLong();
            }
            Arrays.sort(a,Collections.reverseOrder());
            Arrays.sort(b,Collections.reverseOrder());
            long[] arr1=new long[(int) (n+1)];
            long[] arr2=new long[(int) (n+1)];
            for(long i=1;i<=n;i++){
                arr1[(int) i]=a[(int) (i-1)];
                arr2[(int) i]=b[(int) (i-1)];
                arr1[(int) i]+=arr1[(int) (i-1)];
                arr2[(int) i]+=arr2[(int) (i-1)];
            }
            long low=0;
            long high= (long) 1e9;
            while(low<high){
                long mid=(low+high)>>1;
                long top = (n+mid) - (n+mid)/4;
                long a1 = Math.max(top-mid,0L);
                long b1=Math.min(top,n);
                long as = mid*100;
                as+=arr1[(int) a1];
                long b_score=arr2[(int) b1];
                if(as<b_score){
                    low=mid+1;
                }
                else{
                    high=mid;
                }
            }
            System.out.println(low);
        }
    }
}
