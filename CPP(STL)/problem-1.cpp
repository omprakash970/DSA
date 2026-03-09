
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std; 
int maxSum(vector<int> &arr, int k){
    int sum=0; 
    for(int i=0;i<k;i++){
        sum+=arr[i];
    }
    int ans=sum; 
    for(int i=k;i<arr.size();i++){
        sum+=arr[i];
        sum-=arr[i-k];
        ans=max(ans,sum);
    }
    return ans;
}



int main(){
    vector<int> arr={1,2,3,4,5,6,7,8,9};
    int k=3; 
    cout<<maxSum(arr,k)<<endl;

}

