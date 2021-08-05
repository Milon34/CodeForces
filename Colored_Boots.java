package Codeforces;

import java.util.*;

public class Colored_Boots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        Map<Integer,Integer> h=new HashMap<Integer,Integer>();
        for (int m = 0; m < s1.length(); m++) {
            for (int n1 = 0; n1 < s2.length(); n1++) {
                if (s1.charAt(m) == s2.charAt(n1)) {
                    h.put(m+1,n1+1);
                   // System.out.println(m + 1 + " " + (n1 + 1));
                    //s1 = s1.replace(s1.charAt(m), '1');
                }
            }
        }

        Set<Map.Entry<Integer, Integer>> set = h.entrySet();
        Iterator itr=set.iterator();
        System.out.println(set);

        Set<Integer> l=new HashSet<>();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
            l.add((Integer) entry.getValue());

        }
        System.out.println(l);
    }
}

