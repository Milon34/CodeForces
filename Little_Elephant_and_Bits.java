package Codeforces;


import java.util.Scanner;

public class Little_Elephant_and_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean check=false;
        for (int i=0;i<s.length();i++){
          if (s.charAt(i)=='0'){
              String s1= String.valueOf(s.charAt(i));
              s=s.replaceFirst(s1,"");
              check=true;
              break;
          }
        }
        if (check) {
            System.out.println(s);
        }else {
            System.out.println(s.substring(0,s.length()-1));
        }
    }
}
