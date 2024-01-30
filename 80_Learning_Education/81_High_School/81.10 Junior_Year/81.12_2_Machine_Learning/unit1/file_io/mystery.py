myFile = open('unit1/file_io/mystery.txt')
# print(myFile)
stringFile = myFile.read()
words = stringFile.split()
sentences = stringFile.splitlines()

with open("unit1/file_io/mystery.txt") as f:
    lines = f.read().splitlines()

for i in range(10):
    print(lines[i])


count = 0
for line in lines:
    if "the" in line:
        count += 1
print(count)