---
tags:
  - MachineLearning
  - CS
  - "#homework"
---
# battleship.py

```python
from computerHelper import *
from copy import deepcopy
import termcolor

class Battleship:
    def __init__(self):
        self.board = initializeGameBoard()
        self.firedAt = []
        self.ships = self.getShipDictionary()
  
    def getShipDictionary(self):
        locDic = {}
  
        board = self.board
  
        for r in range(len(board)):
            for c in range(len(board[0])):
                letter = board[r][c]
                # print(letter)
                if letter != "~":
                    if letter in locDic:
                        locDic[letter].append((r,c))
                    else:
                        locDic[letter] = [(r,c)]
        # print(locDic)
        return locDic
  
    def getNumShipsRemaining(self):
        locDic = self.ships
        # print(locDic)
        count = 0
        for ship in locDic:
            if len(locDic[ship]) != 0:
                count +=1
        # print(count)
        return count
  
    def getLocationsFiredAt(self):
        return self.firedAt
  
    def makeMove(self, coord):
        self.firedAt.append(coord)
        if self.board[coord[0]][coord[1]] != "~":
            self.ships[self.board[coord[0]][coord[1]]].remove(coord)
            return True
        return False
  
    def makeHiddenBoard(self):
        returnBoard = deepcopy(self.board)
        for r in range(len(self.board)):
            for c in range(len(self.board[0])):
                if (r,c) not in self.firedAt:
                    returnBoard[r][c] = "~"
                else:
                    if self.board[r][c] == "~":
                        returnBoard[r][c] = " "
                    elif len(self.ships[self.board[r][c]]) != 0:
                        returnBoard[r][c] = "*"
                    else: returnBoard[r][c] = self.board[r][c]
        return returnBoard
  
    def printBoard(self, hidden):
        if hidden:
            boardToUse = self.makeHiddenBoard()
        else:
            boardToUse = self.board
  
        print("  0 1 2 3 4 5 6 7 8 9")
        for r in range(len(boardToUse)):
            print(r, end=" ")
            for c in range(len(boardToUse[0])):
                if boardToUse[r][c] == "~":
                    print(termcolor.colored(boardToUse[r][c], "blue"), end=" ")
                elif boardToUse[r][c] == "*":
                    print(termcolor.colored(boardToUse[r][c], "red"), end=" ")
                elif boardToUse[r][c] in "ABCDEFGHIJKLMNOPQRSTUVWXYZ":
                    print(termcolor.colored(boardToUse[r][c], "gray"), end=" ")
                else:
                    print(termcolor.colored(boardToUse[r][c], "white"), end=" ")
            print()
```


# battleshipProgram.py

```python
from battleship import Battleship
  
game = Battleship()
  
print("Hello")
print("You have " + str(game.getNumShipsRemaining()) + " ships remaining")
game.printBoard(True)
  
while game.getNumShipsRemaining() > 0:
    print("Where would you like to guess?")
    row = int(input("Row: "))
    col = int(input("Col: "))
    coord = (row, col)
    if game.makeMove(coord):
        print("Hit!")
    else: print("Miss.")
    print("You have " + str(game.getNumShipsRemaining()) + " ships remaining.")
    print("---------------------------------------")
    game.printBoard(True)

print('yippee')
```