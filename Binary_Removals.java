package Codeforces;

import java.util.Scanner;

public class Binary_Removals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)=='1'){
                    String myS= String.valueOf(s.charAt(i));
                    s=s.replaceFirst(myS,"");
                    i++;
                }
            }
            System.out.println(s);
        }
    }
}
