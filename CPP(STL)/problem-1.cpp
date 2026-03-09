
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std; 
int maxSum(vector<int> &arr, int k){
    int sum=0; 
    int i=0;
    while(i<k&&i<arr.size()){
        sum+=arr[i];
        i++;
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
    vector<int> arr={2,1,5,1,3,2};
    int k=3; 
    cout<<maxSum(arr,k)<<endl;

}

