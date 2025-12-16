#include<iostream>
using namespace std; 
int main(){
    cout<<"Enter a number between 1 and 100: ";
    int number; 
    cin>>number;
    if(number<1 || number>100){
        cout<<"Invalid input! Please enter a number between 1 and 100."<<endl;
    } else {
        cout<<"You entered: "<<number<<endl;
    }
    return 0;
}