package com.milon.CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class IndianSummer {
    public static void main(String[] args) {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        new Token(bf).solve();

    }

     static class Token {
         BufferedReader reader;

        public Token(BufferedReader reader) {
            this.reader = reader;
        }
        public  void solve(){
            int t = wrapperI(read());
            HashSet<String> hash = new HashSet<>();

            while (t-- >0)
            {
                hash.add(read());
            }
            System.out.println(hash.size());

        }

        public  String read() {
            String s = null;

            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return s;
        }
         public int wrapperI(String s){
             return Integer.parseInt(s);
         }
    }


}
