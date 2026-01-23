// Console Tic-Tac-Toe game for Windows (C++)
#include <iostream>
#include <array>
#include <string>

using Board = std::array<char, 9>;

void printSeparator() {
    std::cout << "\n";
}

void drawBoard(const Board &b) {
    auto cell = [&](int i) {
        return b[i] == 'X' || b[i] == 'O' ? b[i] : char('1' + i);
    };

    std::cout << "\n";
    std::cout << " " << cell(0) << " | " << cell(1) << " | " << cell(2) << "\n";
    std::cout << "---+---+---\n";
    std::cout << " " << cell(3) << " | " << cell(4) << " | " << cell(5) << "\n";
    std::cout << "---+---+---\n";
    std::cout << " " << cell(6) << " | " << cell(7) << " | " << cell(8) << "\n";
}

bool isValidMove(const Board &b, int pos) {
    return pos >= 0 && pos < 9 && b[pos] == ' ';
}

bool hasWinner(const Board &b, char player) {
    static const int wins[8][3] = {
        {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, 
        {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, 
        {0, 4, 8}, {2, 4, 6}             
    };
    for (auto &w : wins) {
        if (b[w[0]] == player && b[w[1]] == player && b[w[2]] == player) return true;
    }
    return false;
}

bool isDraw(const Board &b) {
    for (char c : b) if (c == ' ') return false;
    return true;
}

int askMove(const Board &b, char player) {
    while (true) {
        std::cout << "Player " << player << ", choose a position (1-9): ";
        std::string input;
        if (!std::getline(std::cin, input)) return -1; // EOF/interrupt
        if (input.empty()) continue;

        // Trim spaces
        input.erase(0, input.find_first_not_of(' '));
        input.erase(input.find_last_not_of(' ') + 1);

        // Accept single digit 1-9
        if (input.size() == 1 && input[0] >= '1' && input[0] <= '9') {
            int pos = input[0] - '1';
            if (isValidMove(b, pos)) return pos;
            std::cout << "That spot is taken. Try again.\n";
            continue;
        }
        std::cout << "Invalid input. Enter a number 1-9 for an empty spot.\n";
    }
}

void playGame() {
    Board board{};
    board.fill(' ');
    char player = 'X';

    std::cout << "\nWelcome to Tic-Tac-Toe!" << std::endl;
    drawBoard(board);

    while (true) {
        int pos = askMove(board, player);
        if (pos < 0) {
            std::cout << "\nInput ended. Exiting game.\n";
            return;
        }
        board[pos] = player;
        drawBoard(board);

        if (hasWinner(board, player)) {
            std::cout << "\nPlayer " << player << " wins!\n";
            break;
        }
        if (isDraw(board)) {
            std::cout << "\nIt's a draw!\n";
            break;
        }
        player = (player == 'X') ? 'O' : 'X';
    }
}

bool askReplay() {
    while (true) {
        std::cout << "\nPlay again? (y/n): ";
        std::string input;
        if (!std::getline(std::cin, input)) return false;
        if (input.empty()) continue;
        char c = std::tolower(static_cast<unsigned char>(input[0]));
        if (c == 'y') return true;
        if (c == 'n') return false;
        std::cout << "Please enter 'y' or 'n'.\n";
    }
}

int main() {
    do {
        playGame();
    } while (askReplay());
    std::cout << "\nThanks for playing!\n";
    return 0;
}
