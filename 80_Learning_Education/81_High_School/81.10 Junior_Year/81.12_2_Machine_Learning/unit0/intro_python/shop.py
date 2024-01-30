class FruitShop:
    def __init__(self, name, fruitPrices):
        self.fruitPrices = fruitPrices
        self.name = name

    def addFruit(self, newFruit, newPrice):
        self.fruitPrices[newFruit] = newPrice

    def getCostPerPound(self, fruit):
        if fruit not in self.fruitPrices:
            print("Sorry we don't have", fruit)
            return None
        return self.fruitPrices[fruit]

    def getPriceOfOrder(self, orderList):
        totalCost = 0.0
        for fruit in orderList:
            if fruit not in self.fruitPrices:
                print("Sorry we don't have", fruit)
                return None
            totalCost += self.fruitPrices[fruit]
        return totalCost
            
    
    def getName(self):
        return self.name




shop = FruitShop("shop", {"apple": 2, "banana": 1, "pear": 3})

print(shop.getName())
print(shop.getCostPerPound("apple"))
print(shop.getCostPerPound("banana"))
print(shop.getCostPerPound("pear"))