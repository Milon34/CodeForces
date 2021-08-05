package Codeforces;

import java.util.*;

public class Stone_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(sc.nextInt());
            }
            int max = Collections.max(l);
            int min = Collections.min(l);
            if (min>max){
                int temp=max;
                max=min;
                min=temp;
            }
            System.out.println(Math.min(max + 1,Math.min( min + 1 + n - max, n- min)));
        }
    }
}
