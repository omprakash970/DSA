#include <iostream>
using namespace std;
class Account {
public:
    string name;
    int accountNumber;
    double balance;
    Account(string n, int accNum, double bal) {
        name = n;
        accountNumber = accNum;
        balance = bal;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (amount > balance) {
            cout << "Insufficient funds" << endl;
        } else {
            balance -= amount;
        }
    }
    void display() {
        cout << "Name: " << name << endl;
        cout << "Account Number: " << accountNumber << endl;
        cout << "Balance: $" << balance << endl;
    }
};
int main(){
    Account acc1("John Doe", 123456, 1000.0);
    acc1.display();
    acc1.deposit(500.0);
    cout << "After deposit:" << endl;
    acc1.display();
    acc1.withdraw(200.0);
    cout << "After withdrawal:" << endl;
    acc1.display();
    acc1.withdraw(1500.0); 
    return 0;
}