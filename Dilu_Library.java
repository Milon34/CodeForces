package Contest_Practice;

import java.util.Scanner;
public class Dilu_Library {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String str = "";
        int i = 1;
        if(num ==0 || num == 200000000){
            System.out.println(num);
        }
        if (0 < num && num < 200000000) {
            while (num != 0) {
                str = num % 10 + "" + str;
                num = num / 10;
                if (i % 3 == 0 && num != 0) {
                    str = "," + str;
                }
                i++;
            }
            System.out.println(str);
        }
    }
}
