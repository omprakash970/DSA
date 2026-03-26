// There are three types of edits that can be performed on strings: insert a character,
// remove a character, or replace a character. Given two strings, write a function to check if they are
// one edit (or zero edits) away
#include<iostream>
#include<vector>
using namespace std;
class Solution{
    public: 
    bool isOneEditAway(string s, string t){
        if(s.size()==t.size()){
            int count=0; 
            for(int i=0;i<s.size(); i++){
                if(s[i]!=t[i]){
                    count++; 
                }
            }
            return count==1;
        }
        else if(s.size()==t.size()+1){
            int i=0, j=0; 
            while(i<s.size() && j<t.size()){
                if(s[i]!=t[j]){
                    i++; 
                }
                else{
                    i++; 
                    j++; 
                }
            }
            return i==s.size() && j==t.size();
            //commit 
            

        }

    }
};