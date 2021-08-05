//package Codeforces;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//
//public class Secret_Santa {

//    public static void main(String[] args)throws Exception {
//        RealScanner sc = new RealScanner();
//        int N=26;
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            String st;
//            st=sc.next();
//            long n=st.length();
//            Map<Long,Long>freq=new HashMap<>();
//            boolean flag=false;
//            for(long i=0;i<n;i++){
//                freq.put((long) (st.charAt((int) i)-'a'),freq.getOrDefault(st.charAt((int) i)-'a',0l)+1)
//            }
//
//            List<Long>cnt=new ArrayList<>();
//            List<Long>pos=new ArrayList<>();
//
//            for(long i=0;i<N;i++){
//                if(freq.get(i)>0){
//                    cnt.add(freq.get(i));
//                    pos.add(i);
//                }
//            }
//            long m=cnt.size();
//            for(long i=0;i<cnt.size();i++){
//                if(cnt.get((int) i)==1){
//                    System.out.println((char)(97+pos.get((int) i));
//                    cnt.set((int) i,0l);
//                    print(cnt,pos);
//                    flag=1;
//                    break;
//                }
//
//            }
//            if(flag){
//                return;
//            }
//            if(m==1){
//                print(cnt,pos);
//                return;
//            }
//            ll first=cnt[0];
//            ll sum=0;
//            for(ll i=1;i<m;i++){
//                sum+=cnt[i];
//            }
//            if(first-2<=sum){
//                ll x=min(2LL,cnt[0]);
//                for(ll i=0;i<x;i++){
//                    cout<<char(97+pos[0]);
//                }
//                cnt[0]-=x;
//                cout<<char(97+pos[1]);
//                cnt[1]--;
//                for(ll i=1;i<m;i++){
//                    for(ll j=0;j<cnt[i];j++){
//                        if(cnt[0]){
//                            cout<<char(97+pos[0]);
//                            cnt[0]--;
//                        }
//                        cout<<char(97+pos[i]);
//                    }
//                }
//                if(cnt[0]){
//                    cout<<char(97+pos[0]);
//                }
//                cout<<endl;
//            }
//            else{
//                if(m==2){
//                    cout<<char(97+pos[0]);
//                    cnt[0]--;
//                    for(ll i=0;i<cnt[1];i++){
//                        cout<<char(97+pos[1]);
//                    }
//                    for(ll i=0;i<cnt[0];i++){
//                        cout<<char(97+pos[0]);
//                    }
//                    cout<<endl;
//                }
//                else{
//                    cout<<char(97+pos[0]);
//                    cnt[0]--;
//                    cout<<char(97+pos[1]);
//                    cnt[1]--;
//                    for(ll i=0;i<cnt[0];i++){
//                        cout<<char(97+pos[0]);
//                    }
//                    cnt[0]=0;
//                    cout<<char(97+pos[2]);
//                    cnt[2]--;
//                    print(cnt,pos);
//                }
//                }
//            }
//        }
//    }
//}
////static class RealScanner {
////    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////    StringTokenizer st = new StringTokenizer("");
////
////    String next() {
////        while (!st.hasMoreTokens())
////            try {
////                st = new StringTokenizer(br.readLine());
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////        return st.nextToken();
////    }
////
////    int nextInt() {
////        return Integer.parseInt(next());
////    }
////
////    int[] readArray(int n) {
////        int[] a = new int[n];
////        for (int i = 0; i < n; i++) a[i] = nextInt();
////        return a;
////    }
////
////    long nextLong() {
////        return Long.parseLong(next());
////    }
////}