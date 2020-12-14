package Contest_Practice.div2_411;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l,r;
        l=sc.nextInt();
        r=sc.nextInt();
        if (l<r) {
            System.out.println("2");
        }
        else if (l==r){
            System.out.println(l);
        }else {
            System.out.println("2");
        }
    }
}
