#include<iostream>
#include<vector>
using namespace std; 
int main(){
    vector<string> inv;
    int choice; 
    while(true){
        cout<<"1.Add\t2.Remove\t3.Show\t4.Exit\n";
        cin>>choice; 
        if(choice==1){
            string it;
            cout<<"Enter item name: ";
            cin>>it;
            inv.push_back(it);
        }else if(choice==2){
            if(!inv.empty()){
                inv.pop_back();
            }
#random 2:00AM commit
        }else if(choice==3){
            for(const auto& item: inv){
                cout<<item<<endl;
            }
        }
    }
    return 0;

}