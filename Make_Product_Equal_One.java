package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Make_Product_Equal_One {
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
        long[] arr=new long[(int) n];
        long countPos=0,countNeg=0,count=0,perCount=0;
        for (long i=0;i<n;i++){
            arr[(int) i]=sc.nextLong();
            if (arr[(int) i]<0){
                countNeg++;
                count+=Math.abs(arr[(int) i]+1);
            }else if (arr[(int) i]==0){
                count++;
                perCount++;
            }else {
                countPos++;
                count+=Math.abs(arr[(int) i]-1);
            }
        }
        if (countNeg%2!=0&&perCount==0){
            count+=2;
        }else if (countNeg%2!=0&&perCount%2==0){

        }
        System.out.println(count);
    }
}
