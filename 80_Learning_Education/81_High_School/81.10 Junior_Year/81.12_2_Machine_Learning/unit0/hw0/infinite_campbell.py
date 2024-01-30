def get_floor(directions):
    
    level = 0
    for char in directions:
        if char == "^":
            level += 1
        else:
            level -= 1
    return level

def get_final_floor(schedule):
    level = 0
    for directions in schedule: 
        level += get_floor(directions)
    return level

if __name__=="__main__":
    # put any other test cases in here!
    # feel free to use the ones above

    print(get_floor("^^vv")) # should print 0
    print(get_final_floor(["^vv", "vv^^^^^^", "vv^"])) # should print 2