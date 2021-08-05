package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();

        List<String> l=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            l.add(String.valueOf(s.charAt(i)));
        }
        String myS="";
        while (l.size()!=1){
            if (l.size()%2==0){
                myS+=l.get((l.size()/2)-1);

            }
        }
    }
}
