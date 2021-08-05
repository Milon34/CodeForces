package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Challenging_Cliffs {
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
            Map<Integer, Integer> m = new HashMap<>();
            List<Integer> myL=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                myL.add(a);
                m.put(a, m.getOrDefault(a, 0) + 1);
            }
            Collections.sort(myL);
            List<Integer> l=new ArrayList<>();
            int min=Integer.MAX_VALUE,idx=0;
            for (int i=1;i<n;i++){
                if (myL.get(i)-myL.get(i-1)<min){
                    idx=i;
                    min=myL.get(i)-myL.get(i-1);
                }
            }
//            int min=Collections.min(l);
//            int idx=0,a = 0,b = 0;
//            for (int i=0;i<l.size();i++){
//                if (min==l.get(i)){
//                    idx=i;
//                    a=myL.get(idx);b=myL.get(idx+1);
//                    myL.set(idx,0);
//                    myL.set(idx+1,0);
//                    break;
//                }
//            }
//            int per1=Math.max(a,b);
//            int per2=Math.min(a,b);
//            if (n!=2) {
//                System.out.print(per1 + " ");
//                for (int i = myL.size() - 1; i >= 0; i--) {
//                    if (myL.get(i) != 0) {
//                        System.out.print(myL.get(i) + " ");
//                    }
//                }
//                System.out.println(per2 + " ");
//            }else {
//                System.out.println(a+" "+b);
//            }
            System.out.print(myL.get(idx-1)+" ");
            for (int i=idx+1;i<myL.size();i++){
                System.out.print(myL.get(i)+" ");
            }
            for (int i=0;i<idx-1;i++){
                System.out.print(myL.get(i)+" ");
            }
            System.out.println(myL.get(idx));
//            int a = 0, b,k=0;
//            List<Integer> l=new ArrayList<>();
//            for (Map.Entry<Integer, Integer> i : m.entrySet()) {
//                int v1 = i.getKey();
//                int v2 = i.getValue();
//                if (v2>=2&&k==0){
//                    a=v1;
//                    k++;
//                }else {
//                    l.add(v1);
//                }
//            }
//
//            if (a>=2){
//               for (int i=0;i<a-1;i++){
//                   System.out.print(a+" ");
//               }
//            }
//           for (int i=0;i<l.size();i++){
//               System.out.print(l.get(i)+" ");
//           }
//           if (a==0){
//
//           }else {
//               System.out.println(a);
//           }
        }
    }
}
