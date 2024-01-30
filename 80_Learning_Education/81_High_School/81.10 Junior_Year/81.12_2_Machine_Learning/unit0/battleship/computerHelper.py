import random

##### Helper functions you don't need to look at! #####

def allowed(board, row, col, taken):
    return (row, col) not in taken and row >=0 and col >=0 and row < len(board) and col < len(board[0])

def oneOrientation(board, shipPlaces, step, row, col, taken):
    orientation = []
    for dy, dx in shipPlaces:
        nextRow = row + dy*step
        nextCol = col + dx*step
        if allowed(board, nextRow, nextCol, taken):
            orientation.append((nextRow, nextCol))
        else:
            return orientation
    return orientation  

def workingOrientations(board, shipPlaces, row, col, taken):
    flippedPlaces = [(c,r) for (r,c) in shipPlaces]
    orientations = []
    for step in [-1,1]:
        orientation = oneOrientation(board, shipPlaces, step, row, col, taken)
        if len(orientation)==len(shipPlaces):
            orientations.append(orientation)
        orientation = oneOrientation(board, flippedPlaces, step, row, col, taken)
        if len(orientation)==len(shipPlaces):
            orientations.append(orientation)
    return orientations    

def initializeGameBoard():
    board = makeEmptyBoard()
    placeShips(board)
    return board
    
def makeEmptyBoard():
    board = []
    for r in range(10):
        row = []
        for c in range(10):
            row.append('~')
        board.append(row)
    return board

def addShipToBoard(board, orientation, ship, filled):
    for row, col in orientation:
        board[row][col] = ship
        filled.add((row, col))

def placeShips(board):
    ships = {'C':[(0,0), (0,1), (0,2), (0,3), (0,4)], 
             'B':[(0,0), (0,1), (0,2), (0,3)], 
             'D':[(0,0), (0,1), (0,2)], 
             'S':[(0,0), (0,1), (0,2)], 
             'P':[(0,0), (0,1)]}
    allShips = ['C','B','D','S','P']

    shipsToPlace = len(allShips)
    ship = allShips.pop(random.randint(0,len(allShips)-1))
    filled = set()

    while shipsToPlace>0:
        numRows = len(board)
        numCols = len(board[0])
        row = random.randint(0,numRows-1)
        col = random.randint(0,numCols-1)
        shipPlaces = ships[ship]
        possibleOrientations = workingOrientations(board, shipPlaces, row, col, filled)
        if len(possibleOrientations)>0:
            orientation = random.choice(possibleOrientations)
            addShipToBoard(board, orientation, ship, filled)
            shipsToPlace-=1
            if shipsToPlace>0:
                ship = allShips.pop(random.randint(0,len(allShips)-1))