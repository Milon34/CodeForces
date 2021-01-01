package Contest_Practice.div2_691;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) {
        RealScanner rs=new RealScanner();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            char[] ch1=sc.next().toCharArray();
            char[] ch2=sc.next().toCharArray();
            int count1=0,count2=0;
            for (int i=0;i<n;i++){

                if (ch1[i]>ch2[i]){
                    count1++;
                }else if (ch1[i]<ch2[i]){
                    count2++;
                }
            }
            if (count1>count2){
                System.out.println("RED");
            }else if (count1<count2){
                System.out.println("BLUE");
            }else {
                System.out.println("EQUAL");
            }
        }
    }
    static class RealScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
