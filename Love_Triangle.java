package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Love_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>l=new ArrayList<>();
        for (int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        boolean check=false;
        for (int i=1;i<=n;i++){
//            int valFirst=l.get(i-1);
//            int valFirstIdx=l.get(valFirst-1);
//            if (l.get(valFirstIdx-1)==i){
//                check=true;
//            }
            if (l.get(l.get(l.get(i-1)-1)-1)==i){
                check=true;
                break;
            }
        }
        if (check){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
