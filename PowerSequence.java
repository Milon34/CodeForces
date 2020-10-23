package com.milon.CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Asus on 8/30/2020.
 */
public class PowerSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while (t-- >0) {
            int sb = sc.nextInt();
            for (int i = 0; i < sb; i++) {
                ArrayList list = new ArrayList();
                list.add(sb);
                Collections.sort(list);
                count++;
                break;
            }
                if (count==1){
                    System.out.println();
                }

            }


        }

    }

