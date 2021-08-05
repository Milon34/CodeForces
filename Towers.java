package Codeforces;

import java.util.*;

public class Towers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> h = new HashSet<>();
        List<Integer> l=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            l.add(a);
            h.add(a);
        }
        //System.out.println(h);
        List<Integer> per=new ArrayList<>();
        for (int i=0;i<l.size();i++){
            if (Collections.frequency(l,l.get(i))>1){
                per.add(Collections.frequency(l,l.get(i)));
            }
        }
        if (per.isEmpty()){
            System.out.println(1+" "+h.size());
        }else {
            System.out.println(Collections.max(per)+" "+h.size());
        }
    }
}
