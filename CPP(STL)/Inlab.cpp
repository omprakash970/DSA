#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
    srand(time(0));
    int n;
    cout << "How many dice? ";
    cin >> n;
    int sum = 0;
    for (int i = 0; i < n; i++) {
        int r = rand() % 6 + 1;
        cout << "Die " << i + 1 << ": " << r << endl;
        sum += r;
    }
    cout << "Sum: " << sum << endl;
    return 0;
}
