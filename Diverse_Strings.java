package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Diverse_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            char[] ch=sc.next().toCharArray();
            Arrays.sort(ch);
            int val=ch[0]-'a';
            //System.out.println(val);
            boolean check=true;
            for (int i=1;i<ch.length;i++){
                if ((int) ch[i]-'a'==val+1){
                    val=ch[i]-'a';
                }else {
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
