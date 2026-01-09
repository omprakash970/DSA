#include<iostream> 
using namespace std; 
//write a program for the hangman game
int main()
{
    string word = "hangman";
    string guessedWord(word.length(), '_');
    int maxAttempts = 6;
    int attempts = 0; // Current number of incorrect attempts
    char guess; 

    cout << "Welcome to Hangman!" << endl;

    while (attempts < maxAttempts && guessedWord != word) {
        cout << "Current word: " << guessedWord << endl;
        cout << "You have " << (maxAttempts - attempts) << " attempts left." << endl;
        cout << "Enter your guess: ";
        cin >> guess;

        bool correctGuess = false;
        for (size_t i = 0; i < word.length(); i++) {
            if (word[i] == guess) {
                guessedWord[i] = guess; 
                correctGuess = true;
            }
        }

        if (!correctGuess) {
            attempts++;
            cout << "Incorrect guess!" << endl;
        } else {
            cout << "Correct guess!" << endl;
        }
    }

    if (guessedWord == word) {
        cout << "Congratulations! You've guessed the word: " << word << endl;
    } else {
        cout << "Sorry, you've run out of attempts. The word was: " << word << endl;
    }

    return 0;
}