//count the occurences of the given number in an array using the STL 
#include<iostream>
#include<algorithm>
#include<vector>
using namespace std; 
int main(){
    vector<int> arr={1, 2, 3, 4, 5, 1, 2, 1};
    int num; 
    cout<<"Enter the number to count its occurrences: ";
    cin>>num;
    int count = std::count(arr.begin(), arr.end(), num);
    cout<<"The number "<<num<<" occurs "<<count<<" times in the array."<<endl;
}