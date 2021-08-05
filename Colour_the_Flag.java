package Codeforces;

import java.util.Scanner;

public class Colour_the_Flag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            boolean check = true;
            for (int i = 0; i < n; i++) {
                String myS = arr[i];
                for (int j = 1; j < myS.length(); j++) {
                    if (myS.charAt(j)==myS.charAt(j-1)){

                    }
                }
            }
        }
    }
}
