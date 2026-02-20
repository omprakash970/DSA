#include<iostream>
#include<ctime>
#include<cstdlib>
using namespace std; 

int main(){
  srand(time(0));
  string choices[]={"rock","paper","scissors"};
  int computer_choice=rand()%3;
    string user_choice;
    cout<<"Enter your choice (rock, paper, scissors): ";
    cin>>user_choice;
    cout<<"Computer chose: "<<choices[computer_choice]<<endl;
    if(user_choice==choices[computer_choice]){
        cout<<"It's a tie!"<<endl;
    }
    else if((user_choice=="rock" && choices[computer_choice]=="scissors") ||
            (user_choice=="paper" && choices[computer_choice]=="rock") ||
            (user_choice=="scissors" && choices[computer_choice]=="paper")){
        cout<<"You win!"<<endl;
    }
    else{
        cout<<"Computer wins!"<<endl;
    }

    return 0;

}