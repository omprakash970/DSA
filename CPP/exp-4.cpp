#include<iostream>
using namespace std;
//create a tic-tac-toe board using 2D array
int main(){
    char board[3][3] = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    cout << "Tic-Tac-Toe Board:" << endl;
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            cout << board[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}