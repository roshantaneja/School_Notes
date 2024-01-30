

def total_fruit_cost(fruitbasket, fruitcost):
    totalCost = 0
    for fruit in fruitbasket:
        if fruit not in fruitcost:
            print("I don't know the cost of", fruit)
            continue
        totalCost += fruitcost[fruit]
    return totalCost



if __name__=="__main__":
    fruits = []
    fruits.append("banana")
    fruits.append("banana")
    fruits.append("apple")
    fruits.append("mango")

    applePrice = 2
    pearPrice = 5
    bananaPrice = 1

    fruitcost = {}
    fruitcost["apple"] = 2
    fruitcost["pear"] = 5
    fruitcost["banana"] = 1
    fruitcost["mango"] = 7

    totalCost = total_fruit_cost(fruits, fruitcost)

    print("The total cost of the fruit basket is", totalCost)

    

    
