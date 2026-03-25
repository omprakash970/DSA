//given two strings, write a function to check if other string is permutation of the first string.
#include<iostream>
#include<unordered_map>
#include<vector>
#include<algorithm>
using namespace std;
class Solution{
    public:
    bool isPermuation(string s, string t){
        unordered_map<char, int>m; 
        for(int i=0;i<s.size();i++){
            m[s[i]]++; 
        }
       for(int j=0;j<t.size();j++){
        if(s.find(t[j])==s.end()){
            return false; 
        }
        m[t[j]]--;
        if(m[t[j]]<0){
            return false; 
        }
       }
        return true;
    }
    };
int main(){
    Solution s;
    s.isPermuation("abc", "bca")? cout<<"Yes\n": cout<<"No\n";
    return 0;

}