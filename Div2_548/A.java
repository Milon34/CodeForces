package Contest_Practice.Div2_548;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(  System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int result=0;
        for (int i=0;i<s.length();i++){
            if ((s.charAt(i)-'0')%2==0){
                result=result+(i+1);
            }
        }
        System.out.println(result);
    }
}
