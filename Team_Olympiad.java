package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Team_Olympiad {
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

    public <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[4];
        boolean check = true;
       // TreeMap<Integer, Integer> t = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr1[arr[i]]++;
           // t.put(i, arr[i]);
        }
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                l.add(arr1[i]);
            }
        }
        List<Integer> myList1=new ArrayList<>();
        List<Integer> myList2=new ArrayList<>();
        List<Integer> myList3=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                myList1.add(i+1);
            }else if (arr[i]==2){
                myList2.add(i+1);
            }else if (arr[i]==3){
                myList3.add(i+1);
            }
        }
        if (myList1.size()>0&&myList2.size()>0&&myList3.size()>0) {
            int val = Collections.min(l);
            System.out.println(val);
            for (int i = 0; i < val; i++) {
                System.out.println(myList1.get(i) + " " + myList2.get(i) + " " + myList3.get(i));
            }
        }else {
            System.out.println(0);
        }

    }
}
