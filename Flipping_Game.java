package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Flipping_Game {
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
//        if ((arr[0] == 1) && arr[arr.length - 1] == 1) {
//            int count = 2;
//            for (int i = 0; i < 1; i++) {
//                for (int j = i + 1; j < n - 1; j++) {
//                    if (arr[j] == 0) {
//                        count++;
//                    }
//                }
//            }
//            System.out.println(count);
//        } else if (arr[0] == 0 && arr[arr.length - 1] == 0) {
//            int count = 0;
//            for (int i = 0; i < n; i++) {
//                if (arr[i] == 0) {
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }else {
//            int count=1;
//            for (int i=0;i<n;i++){
//               if (arr[i]==0){
//                   count++;
//               }
//            }
//            System.out.println(count);
//        }
        int count1 = 0, count0 = 0,max=-1;
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            if (val == 1) {
                count1++;
                if (count0 > 0) {
                    count0--;
                }
            }
            if (val==0){
                count0++;
                if (count0>max){
                    max=count0;
                }
            }
        }
        System.out.println(count1+max);
    }
}
