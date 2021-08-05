package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_and_Peaks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            if (n==k){
                System.out.println(-1);
            }else if (n<k){
                System.out.println(-1);
            }else {
                if (n%2!=0){
                    List<Integer> l1=new ArrayList<>();
                    List<Integer> l2=new ArrayList<>();
                    int myVal=(n/2)+1;
                    for (int i=1;i<=n/2;i++){
                        l1.add(i);
                    }
                    for (int i=(n/2)+2;i<=n;i++){
                        l2.add(i);
                    }
                    List<Integer> per=new ArrayList<>();
                    int s=l1.size()-1;
                    for (int i=0;i<l1.size();i++){
                        per.add(l1.get(s));
                        per.add(l2.get(i));
                        s--;
                    }
                    per.add(myVal);
                    if ((per.size()/2)>=k){
                        for (int i:per){
                            System.out.print(i+" ");
                        }
                        System.out.println();
                    }else {
                        System.out.println(-1);
                    }
                }else if (n>2){
                    List<Integer> l1=new ArrayList<>();
                    List<Integer> l2=new ArrayList<>();
                    for (int i=1;i<=n/2;i++){
                        l1.add(i);
                    }
                    for (int i=(n/2)+1;i<=n;i++){
                        l2.add(i);
                    }
                    List<Integer> per=new ArrayList<>();
                    int s=0;
                    for (int i=l1.size()-1;i>=0;i--){
                        per.add(l1.get(i));
                        per.add(l2.get(s));
                        s++;
                    }
                    if ((per.size()/2)>=k){
                        for (int i:per){
                            System.out.print(i+" ");
                        }
                        System.out.println();
                    }else {
                        System.out.println(-1);
                    }
                }else {
                    System.out.println(-1);
                }
            }
        }
    }
}
