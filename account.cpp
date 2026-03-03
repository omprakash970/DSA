//write a cpp program to overload a method, write a method subtract to work with two parameters and three parameters
#include <iostream>
using namespace std;
class Account {
public:
    double result;
    Account(double ans) {
        result = ans;
    }
    double subtract(double a, double b) {
        return result - a - b;
    }
    double subtract(double a, double b, double c) {
        return result - a - b - c;
    }
};
int main() {
    Account myAccount(1000.0);
    cout << "Balance after subtracting 200 and 300: " << myAccount.subtract(200.0, 300.0) << endl;
    cout << "Balance after subtracting 150: " << myAccount.subtract(150.0, 0.0, 0.0) << endl;
    return 0;
}