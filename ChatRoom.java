package com.milon.CodeForces;

import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ch=sc.next();
        String h="hello";

        if (h.matches(ch)){
            System.out.println("YES");

        }else {
            System.out.println("NO");
        }
    }
}
