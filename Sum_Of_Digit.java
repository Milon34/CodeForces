package Contest_Practice;

import java.util.Scanner;

public class Sum_Of_Digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        int sum=0;
        while (value!=0){
            sum=sum+(value%10);
            value=value/10;
        }
        System.out.println(sum);
    }
}
