package Codeforces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class AGAGA_XOOORRR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long arr[] = new long[(int) n];
            for (long i = 0; i < n; i++) {
                arr[(int) i] = sc.nextLong();
            }
            List<Long> l = new ArrayList<>();
            for (long i = 0; i < n-1; i++) {
                l.add(arr[(int) i] ^ arr[(int) (i+1)]);
            }
            HashSet<Long> h=new HashSet<>();
            for (long i=0;i<l.size();i++){
                h.add(l.get((int) i));
            }
            if (h.size()==2){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
