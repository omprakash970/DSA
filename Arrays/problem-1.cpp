//Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

#include<iostream>
#include<unordered_map>
using namespace std;
class Solution{
    public:
    bool isUnique(string s, string t){
        unordered_map<char, int>m; 
        for(int i=0;i<s.size();i++){
            m[s[i]]++; 
        }
        for(int j=0;j<t.size();j++){
            if(m.find(t[j])!=m.end()){
                return false; 
            }
        }
        return true;

    }
};
int main(){
    Solution s; 
    s.isUnique("abc", "def")? cout<<"Yes\n": cout<<"No\n";
    
}