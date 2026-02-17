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
int main(){
    Dog d;
    d.eat(); // Inherited from Animal
    d.bark(); // Dog's own method
    return 0;
}

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
    Car myCar;
    myCar.start();      // Inherited from Vehicle
    myCar.openTrunk();  // Car's own method
    return 0;
}