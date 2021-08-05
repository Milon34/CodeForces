package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Playing_with_Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        int count1 = 0,count2=0,count3=0;
        for (int i = 1; i <= 6; i++) {
            if (Math.abs(a - i) < Math.abs(b - i)) {
                count1++;
            }
            if (Math.abs(a - i) == Math.abs(b - i)){
                count2++;
            }
            if (Math.abs(a - i) > Math.abs(b - i)){
                count3++;
            }
        }
        System.out.println(count1+" "+count2+" "+count3);
    }
}
