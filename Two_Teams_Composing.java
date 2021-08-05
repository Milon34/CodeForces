package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Two_Teams_Composing {
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
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Vector<Integer> l=new Vector<>();

            HashMap<Integer,Integer> hashMap=new HashMap<>();
            HashSet<Integer> h=new HashSet<>();
            int count=0,max=0;
            for (int i=0;i<n;i++){
                int x=sc.nextInt();
                h.add(x);
                hashMap.put(x,hashMap.getOrDefault(x,0)+1);
//                if (hashMap.get(x)==1){
//                    count++;
//                }
                max=Math.max(max,hashMap.get(x));
            }
            count=h.size();
            if (count<max){
                System.out.println(count);
            }else if (count==max){
                System.out.println(max-1);
            }else {
                System.out.println(max);
            }



//            int[] arr=new int[n+1];
//            for (int i=0;i<n;i++){
//                arr[sc.nextInt()]++;
//            }
//            Arrays.sort(arr);
//            System.out.println(Arrays.toString(arr));
//            int maxVal=arr[arr.length-1];
//            int zeroCount=0;
//            for (int i=0;i<arr.length;i++){
//                if (arr[i]==0){
//                    zeroCount++;
//                }
//            }
//            int diff=n+1-zeroCount;
//            System.out.println(Math.max(Math.min(maxVal-1,diff),Math.min(maxVal,diff-1)));
        }
    }
}

