package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n;
            n=sc.nextLong();
            long a[]=new long[(int) n];
            long b[]=new long[(int) n];
            long c[]=new long[(int) n];
            long c1=0;
            for(long i=0;i<n;i++){
                a[(int) i]=sc.nextLong();
                a[(int) i]--;
                c[(int) i]=0;
            }
            List<Long> left=new ArrayList<>();
            for(long i=0;i<n;i++){
                if(c[(int) a[(int) i]]==0){
                    b[(int) i]=a[(int) i];
                    c[(int) a[(int) i]]=1;
                    c1++;
                }
                else{
                    b[(int) i]=-1;
                    left.add(i);
                }
            }
            System.out.println(c1);
            long ct=0;
           List<Long>v=new ArrayList<>();
            for(long i=0;i<n;i++){
                if(c[(int) i]==0){
                    ct++;
                    v.add(i);
                }
            }
            if(ct==0){
                for(long i=0;i<n;i++) {
                    System.out.print((b[(int) i] + 1) + " ");
                }
                System.out.println();
                continue;
            }
            if(ct==1){
                if(left.get(0)==v.get(0)){
                    for(long i=0;i<n;i++){
                        if(b[(int) i]==a[Math.toIntExact(left.get(0))])
                            b[(int) i]=v.get(0);
                    }
                    b[Math.toIntExact(left.get(0))]=a[Math.toIntExact(left.get(0))];
                }
                else
                    b[Math.toIntExact(left.get(0))]=v.get(0);
                for(long i=0;i<n;i++)
                    System.out.print((b[(int) i]+1)+" ");
                System.out.println();
                continue;
            }
            Collections.reverse(v);
            long sz=v.size()-1;
            while(v.size()>3){
                if(sz%2==0){
                    if(v.get((int) sz)==left.get((int) sz) || v.get((int) (sz-1))==left.get((int) (sz-1))){
                        b[Math.toIntExact(left.get((int) sz))]=v.get((int) (sz-1));
                        b[Math.toIntExact(left.get((int) (sz - 1)))]=v.get((int) sz);
                        v.remove(v.size()-1);
                        left.remove(left.size()-1);
                        v.remove(v.size()-1);
                        left.remove(left.size()-1);
                    }
                    else{
                        b[Math.toIntExact(left.get((int) sz))]=v.get((int) sz);
                        b[Math.toIntExact(left.get((int) (sz - 1)))]=v.get((int) sz);
                        v.remove(v.size()-1);
                        left.remove(left.size()-1);
                        v.remove(v.size()-1);
                        left.remove(left.size()-1);
                    }
                    sz-=2;
                }
                else{
                    if(v.get((int) sz)==left.get((int) sz) || left.get((int) (sz-1))==v.get((int) (sz-1))){
                        b[Math.toIntExact(left.get((int) sz))]=v.get((int) (sz-1));
                        b[Math.toIntExact(left.get((int) (sz - 1)))]=v.get((int) sz);
                        v.remove(v.size()-1);
                        left.remove(left.size()-1);
                        v.remove(v.size()-1);
                        left.remove(left.size()-1);
                        sz-=2;
                    }
                    else{

                        b[Math.toIntExact(left.get((int) sz))]=v.get((int) sz);
                        v.remove(v.size()-1);
                        left.remove(left.size()-1);
                        sz--;
                    }
                }
            }
            if(left.size()==3){
                if(left.get(2)!=v.get(2)){
                    b[Math.toIntExact(left.get((int) sz))]=v.get((int) sz);
                    v.remove(v.size()-1);
                    left.remove(left.size()-1);
                    sz--;
                }
            }
            if(left.size()==2){
                if(v.get((int) sz).equals(left.get((int) sz)) || v.get((int) (sz-1))==left.get((int) (sz-1))){
                    b[Math.toIntExact(left.get((int) sz))]=v.get((int) (sz-1));
                    b[Math.toIntExact(left.get((int) (sz - 1)))]=v.get((int) sz);
                    v.remove(v.size()-1);
                    left.remove(left.size()-1);
                    v.remove(v.size()-1);
                    left.remove(left.size()-1);
                }
                else{
                    b[Math.toIntExact(left.get((int) sz))]=v.get((int) sz);
                    b[Math.toIntExact(left.get((int) (sz - 1)))]=v.get((int) (sz-1));
                    v.remove(v.size()-1);
                    left.remove(left.size()-1);
                    v.remove(v.size()-1);
                    left.remove(left.size()-1);
                }
            }
            else{
                b[Math.toIntExact(left.get((int) sz))]=v.get((int) (sz-1));
                b[Math.toIntExact(left.get((int) (sz - 1)))]=v.get((int) sz);
                v.remove(v.size()-1);
                left.remove(left.size()-1);
                v.remove(v.size()-1);
                left.remove(left.size()-1);
                sz-=2;
                b[Math.toIntExact(left.get((int) sz))]=v.get((int) sz);
            }
            for(long i=0;i<n;i++)
                System.out.print(b[(int) i]+1+" ");
            System.out.println();
        }
    }
}
