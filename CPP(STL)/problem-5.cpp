/*

4️⃣ Find Element

Concepts:

find()

iterator

Problem

Return index of x in array. If not present print -1.

Example

Input
5
10 20 30 40 50
30

Output

2

Hint

auto it = find(v.begin(), v.end(), x);


*/
#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
    int n;
    cout<<"Enter the size of the array: ";
    cin>>n;
    vector<int> arr(n);
    cout<<"Enter the elements of the array: ";
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    int x;
    cout<<"Enter the number to find its index: ";
    cin>>x;
    
    auto it = find(arr.begin(), arr.end(), x);
    
    if(it != arr.end()){
        int index = distance(arr.begin(), it);
        cout<<"The index of "<<x<<" is: "<<index<<endl;
    } else {
        cout<<"-1"<<endl; // Element not found
    }
}