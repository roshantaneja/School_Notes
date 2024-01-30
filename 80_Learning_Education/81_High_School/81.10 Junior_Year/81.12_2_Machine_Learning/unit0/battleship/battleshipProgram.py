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