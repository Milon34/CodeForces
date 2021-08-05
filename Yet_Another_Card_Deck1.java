package Codeforces;

import java.util.Scanner;
import java.util.Stack;

public class Yet_Another_Card_Deck1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        Stack<Integer> arr1 = new Stack<>();
        Stack<Integer> arr2 = new Stack<>();
        for (int i = 0; i < m; i++) {
            arr1.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            arr2.add(sc.nextInt());
        }
    }
}
