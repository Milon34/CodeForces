package Codeforces;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reverse_String {
    static class RealScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
    public static void main(String[] args) {
        RealScanner sc = new RealScanner();
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1, s2;
            s1 = sc.next();
            s2 = sc.next();
            int n = s1.length();
            int m = s2.length();
            boolean f = false;
            for (int idx1 = 0; idx1 < n; idx1++) {
                for (int idx2 = 0; idx2 < m; idx2++) {
                    if (s1.charAt(idx1) == s2.charAt(idx2)) {
                        int k;
                        int c = 0;
                        for (k = idx2; k >= 0; k--) {
                            if (idx1 - c < 0) {
                                break;
                            }
                            if (s2.charAt(k) != s1.charAt(idx1 - c)) {
                                break;
                            }
                            c++;
                        }
                        c = 0;
                        int ls;
                        for ( ls = idx2; ls < m; ls++) {
                            if (idx1 - c < 0) {
                                break;
                            }
                            if (s2.charAt(ls) != s1.charAt(idx1 - c)) {
                                break;
                            }
                            c++;
                        }
                        if (k-1 == -2 && ls-1 == m-1) {
                            f = true;
                        }

                    }
                    if (f) {
                        break;
                    }
                }
            }
            if (f) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
//           String s=sc.next();
//           int[] dp=new int[10];
//           for (int i=1;i<s.length();i++){
//               if (s.charAt(i)=='?'){
//                   dp[i]++;
//               }else {
//                   dp[i]+=dp[i-1];
//               }
//           }
//            System.out.println(Arrays.toString(dp));

}


//#include<bits/stdc++.h>
//        using namespace std;
//        #define ll long long
//        #define FAST1 ios_base::sync_with_stdio(false);
//        #define FAST2 cin.tie(NULL);
//
//        bool check(string & s1, string & s2, string & t, ll start,vector<ll> & idx1, vector<ll> & idx2){
//        ll n1=s1.size();
//        ll n2=s2.size();
//        ll m=t.size();
//        vector<vector<ll>> pos1(27),pos2(27);
//        for(ll i=0;i<n1;i++){
//        pos1[s1[i]-'a'].push_back(idx1[i]);
//        }
//        for(ll i=0;i<n2;i++){
//        pos2[s2[i]-'a'].push_back(idx2[i]);
//        }
//        ll cur=0;
//        for(ll i=0;i<m;i++){
//        ll x=t[i]-'a';
//
//        if(start & 1){
//
//        auto xx = lower_bound(pos1[x].begin(),pos1[x].end(),cur);
//        if(xx!=pos1[x].end()){
//        cur=*xx;
//        }
//        else{
//        return false;
//        }
//        start^=1;
//        }
//        else{
//        auto xx = lower_bound(pos2[x].begin(),pos2[x].end(),cur);
//        if(xx!=pos2[x].end()){
//        cur=*xx;
//        }
//        else{
//        return false;
//        }
//        start^=1;
//        }
//
//        }
//        return true;
//        }
//        void solve(){
//        string s,t;
//        cin>>s>>t;
//
//        string s1,s2;
//        s+="{";
//        t+="{";
//        ll n=s.size();
//        vector<ll> idx1,idx2;
//        for(ll i=0;i<n;i++){
//        if(i & 1){
//        s1+=s[i];
//        idx1.push_back(i);
//        }
//        else{
//        s2+=s[i];idx2.push_back(i);
//        }
//        }
//        if(check(s1,s2,t,0,idx1,idx2) or check(s1,s2,t,1,idx1,idx2)){
//        cout<<"Yes"<<endl;
//        }
//        else{
//        cout<<"No"<<endl;
//        }
//        }
//
//        int main(){
//        FAST1;
//        FAST2;
//        ll t;
//        cin>>t;
//        while(t--){
//        solve();
//        }
//        }
//
//     #include<bits/stdc++.h>
//        using namespace std;
//        #define ll long long
//        #define FAST1 ios_base::sync_with_stdio(false);
//        #define FAST2 cin.tie(NULL);
//
//        bool check2(ll s1, ll s2, ll rem){
//        if(s1+rem<s2){
//        return true;
//        }
//        return false;
//        }
//        bool check1(ll s1, ll s2, ll rem){
//        if(s2+rem<s1){
//        return true;
//        }
//        return false;
//        }
//
//        ll calc(vector<ll> & arr){
//        ll c1=0,c2=0;
//        ll ans=9;
//        for(ll i=1;i<10;i+=2){
//        c1+=arr[i-1];
//        ll rem = (10-i-1)/2;
//        rem++;
//        if(check1(c1,c2,rem) or check2(c1,c2,rem-1)){
//        ans=i-1;
//        break;
//        }
//        c2+=arr[i];
//        rem--;
//        if(check1(c1,c2,rem) or check2(c1,c2,rem)){
//        ans=i;
//        break;
//        }
//        }
//        return ans+1;
//        }
//        void solve(){
//        string s;
//        cin>>s;
//        vector<ll> arr(10);
//        for(ll i=0;i<10;i++){
//        if(s[i]=='?'){
//        if(i & 1){
//        arr[i]=0;
//        }
//        else{
//        arr[i]=1;
//        }
//        }
//        else if(s[i]=='1'){
//        arr[i]=1;
//        }
//        else{
//        arr[i]=0;
//        }
//        }
//        vector<ll> arr1(10);
//        for(ll i=0;i<10;i++){
//        if(s[i]=='?'){
//        if(i & 1){
//        arr1[i]=1;
//        }
//        else{
//        arr1[i]=0;
//        }
//        }
//        else if(s[i]=='1'){
//        arr1[i]=1;
//        }
//        else{
//        arr1[i]=0;
//        }
//        }
//        cout<<min(calc(arr),calc(arr1))<<endl;
//
//        }
//
//        int main(){
//        FAST1;
//        FAST2;
//        ll t;
//        cin>>t;
//        while(t--){
//        solve();
//        }
//        }