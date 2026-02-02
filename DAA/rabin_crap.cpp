#include<bits/stdc++.h>
using namespace std; 

#define d 256;
void rabinkrap(string text, string pattern, int q){
    int n=text.length();
    int m=pattern.length();
    int p=0; //hash value for pattern
    int t=0; //hash value for text
    int h=1; 
    for(int i=0;i<m-1;i++){
        h=(h*d)%q;
    }
    for(int i=0;i<m;i++){
        p=(d*p+pattern[i])%q;
        t=(d*t+text[i])%q;
    }
    for(int i=0;i<=n-m;i++){
        if(p==t){
            
        }
    }

}