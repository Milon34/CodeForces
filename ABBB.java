package com.milon.CodeForces;

import java.util.Scanner;
import java.util.Stack;

public class ABBB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {


            String s = sc.next();
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    st.add(i);
                } else {
                    if (s.charAt(i) == 'B' && st.isEmpty()) {
                        st.add(i);
                    } else {
                        st.pop();
                    }
                }
            }
            System.out.println(st.size());

        }
    }
}
//    int capasity=3;
//    int [] stack=new int[capasity];
//    int top=-1;
//
//    void push(int x){
//        if (top<capasity-1) {
//            top = top + 1;
//            stack[top] = x;
//            System.out.println(x);
//        }else {
//            //System.out.println("Exception push.!");
//        }
//    }
//    int pop(){
//
//        if (top<0){
//
//           // System.out.println("Exception! pop");
//            return -1;
//
//
//        }else {
//
//            int value=stack[top];
//
//            top=top-1;
//            return value;
//        }
//    }
//    int peek(){
//        if (top<0) {
//            //System.out.println("Exception! Stack underflow.");
//            return -1;
//        }else {
//            return stack[top];
//        }
//
//    }
//
//}
