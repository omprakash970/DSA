#include<bits/stdc++.h>
using namespace std; 
void naive_string_matching(string text, string pattern){
    int n=text.length();
    int m=pattern.length();
    for(int i=0;i<=n-m;i++){
        int j; 
        for(int j=0;j<m;j++){
            if(text[i+j]!=pattern[j]){
                break;
            }
            if(j==m-1){
                cout<<"Pattern found at index "<<i<<endl;
            }
        }
    }
}