newList = []

newList.append(5)
newList.append(70)
newList.append(12)

print(newList)


newList.remove(70)

print(newList)

newList.pop(0)

#dictionary

flowers = [
    "rose",
    "lily",
    "tulip",
    "rose",
    "dandelion"
]

numFlowers = {}

for flower in flowers:
    if flower in numFlowers:
        numFlowers[flower] += 1
    else:
        numFlowers[flower] = 1

print(numFlowers)


flowerLocations = {}

for i in range(len(flowers)):
    if flowers[i] in flowerLocations:
        flowerLocations[flowers[i]].append(i)
    else:
        flowerLocations[flowers[i]] = [i]

print(flowerLocations)

# tuples

coord = (2, 4)

print(coord[0])
print(coord[1])

# 2d lists

grid = []

for r in range(7):
    newRow = []
    for c in range(10):
        newRow.append(r*c)
    grid.append(newRow)


for r in range(len(grid)):
    for c in range(len(grid[r])):
        print(grid[r][c], end=" ")
    print()

numEven = 0

for r in range(len(grid)):
    for c in range(len(grid[r])):
        if grid[r][c] % 2 == 0:
            numEven += 1

print(numEven)




