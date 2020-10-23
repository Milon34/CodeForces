package Contest_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BarrelsSolutionTest {
    public static void main(String[] args) {

        ///Start Code...
        RealScanner rs=new RealScanner();
        int t=rs.nextInt();
        for (int is=0; is<t; is++) {
            int n=rs.nextInt(), k=rs.nextInt();
            int[] a=rs.readArray(n);

            long sum=0;
            sort(a);
            //System.out.println(Arrays.stream(a).toArray());
            for (int i=0; i<=k; i++){
                sum+=a[n-1-i];
            }
            System.out.println(sum);
        }
    }


    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a){
            l.add(i);
        }
        Collections.sort(l);
        for (int i=0; i<a.length; i++){
            a[i]=l.get(i);
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
            for (int i=0; i<n; i++){
                a[i]=nextInt();
            }
            return a;
        }

    }


}
class Hello{
    public static void main(String[] args) {
       Boolean a=new Boolean("false");

        System.out.println(a.hashCode());
    }
}