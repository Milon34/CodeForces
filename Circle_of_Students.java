package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Circle_of_Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        m:
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            if (n == 1 || n == 2) {
                System.out.println("YES");
                continue;
            }
            for (int i = 0; i < n; i++) {
                l.add(sc.nextInt());
            }
            int idx = l.indexOf(new Integer(1));
            boolean check = true;
            for (int i = idx; i > 0; i--) {
                if (Math.abs(l.get(i) - l.get(i - 1)) != 1) {
                    check = false;
                    break;
                }
            }
            if (!check) {
                System.out.println("NO");
                continue m;
            }
            for (int i = n - 1; i > idx + 1; i--) {
                if (Math.abs(l.get(i) - l.get(i - 1)) != 1) {
                    check = false;
                    break;
                }
            }
            if (!check) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }
    }
}
