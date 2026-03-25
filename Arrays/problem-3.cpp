// Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string.
#include<iostream>
#include<vector>
using namespace std;
int main(){
    class Solution{
        public: 
        void replaceSpaces(string &s, int truelength){
            int space_count=0; 
            for(int i=0; i<truelength; i++){
                if(s[i]==' '){
                    space_count++; 
                }
            }
            int index=truelength+space_count*2; 
            for(int i=truelength-1; i>=0; i--){
                if(s[i]==' '){
                    s[index-1]='0';
                    s[index-2]='2';
                    s[index-3]='%';
                    index-=3;
                }
                else{
                    s[index-1]=s[i];
                    index--;
                }
            }

        }
    };