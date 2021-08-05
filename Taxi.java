package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Taxi {
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
        RealScanner sc = new RealScanner();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int  count = 0;
        int[] myArray=new int[5];
        for (int i = 0; i < n; i ++) {
           myArray[arr[i]]++;
        }
        int sum=myArray[4]+myArray[3]+(myArray[2]/2);
        myArray[1]=myArray[1]-myArray[3];
        if (myArray[2]%2==1){
            sum+=1;
            myArray[1]-=2;
        }
        if (myArray[1]>0){
            sum+=(myArray[1]+3)/4;
        }
        System.out.println(sum);
           // System.out.println(n-(2*count)+1);

            //System.out.println(n - (2 * count));

    }
}
