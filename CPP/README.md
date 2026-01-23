# Tic-Tac-Toe (C++)

A simple interactive console Tic-Tac-Toe game for two players.

## Build & Run (Windows)

### Using g++ (MinGW)

```powershell
cd C:\Users\Oppie_549\Apna_clg_DSA
Get-Command g++ | Out-Null; if ($?) { g++ -std=c++17 -O2 -Wall -Wextra -o CPP\tictactoe.exe CPP\exp-4.cpp } else { Write-Host "g++ not found. Install MinGW-w64 or use MSVC (cl)." }
./CPP/tictactoe.exe
```

### Using MSVC `cl` (Developer Command Prompt)

```cmd
cd C:\Users\Oppie_549\Apna_clg_DSA
cl /EHsc /W4 /Fe:CPP\tictactoe.exe CPP\exp-4.cpp
CPP\tictactoe.exe
```

## How to Play
- The board shows positions labeled 1-9.
- Players take turns entering a number (1-9) to place `X` or `O`.
- Win is detected for 3 in a row/column/diagonal.
- Draw is detected when the board is full.
- After a game, choose to replay by entering `y` or `n`.