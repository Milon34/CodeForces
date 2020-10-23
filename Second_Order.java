package com.milon.CodeForces;

import java.util.*;

public class Second_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp=0,currentMin=101,secondMin=101;
        int n = sc.nextInt();

      for (int i=0;i<n;i++) {
          temp = sc.nextInt();
          if (temp < currentMin) {
              secondMin = currentMin;
              currentMin = temp;
          } else if (currentMin < temp && temp < secondMin) {
              secondMin = temp;
          }
      }
          if (secondMin ==currentMin || secondMin==101){
              System.out.println("NO");
          }else {
              System.out.println(secondMin);


      }

    }
}
