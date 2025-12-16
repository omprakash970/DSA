#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
    cout << "Welcome to the guessing game!" << endl;
    
    srand(time(0));
    int number = rand() % 100 + 1;
    int guess, attempts = 0;
    
    while (cin >> guess) {
        attempts++;
        
        if (guess < number) {
            cout << "Too low! Try again." << endl;
        } else if (guess > number) {
            cout << "Too high! Try again." << endl;
        } else {
            cout << "Congratulations! You guessed " << number 
                 << " in " << attempts << " attempts." << endl;
            break;
        }
    }
    
    return 0;
}
