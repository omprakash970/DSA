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