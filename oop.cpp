#include<iostream>
using namespace std;
class Animal{
    public: 
    void eat(){
        cout<<"Animal eats food"<<endl;
    }
};
class Dog: public Animal{
    public:
    void bark(){
        cout<<"Dog barks"<<endl;
    }
};
class Vehicle {
    public:
    void start() {
        cout << "Vehicle started" << endl;
    }
};

class Car : public Vehicle {
    public:
    void openTrunk() {
        cout << "Car trunk opened" << endl;
    }
};

int main(){
    Dog d;
    d.eat(); 
    d.bark(); 
    
    Car myCar;
    myCar.start();      
    myCar.openTrunk();  
    return 0;
}