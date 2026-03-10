#include<iostream>
#include<vector>
#include<algorithm>
#include<bits/stdc++.h>
using namespace std;
string minWindow(string s, string t){
    unordered_map<char, int> need; 
    unordered_map<char, int> window;
    for(char c:t){
        need[c]++; 
    }
    int required=need.size();
    int formed=0; 
    int left=0, right=0;
    int minLen=INT_MAX;
    int start=0; 
    while(right<s.size()){
        char c=s[right]; 
        window[c]++; 
        if(need.count(c)&&window[c]==need[c]){
            formed++;
        }
    }
}