#include<iostream>
using namespace std; 
class Animal{
    public: 
    void sound(){
        cout<<"Animal sound"<<endl;
    }

};
class Dog:public Animal{
    public: 
    void sound(){
        cout<<"Dog barks"<<endl;
    }
};
class Cat:public Animal{
    public: 
    void sound(){
        cout<<"Cat meows"<<endl;
    }
};
