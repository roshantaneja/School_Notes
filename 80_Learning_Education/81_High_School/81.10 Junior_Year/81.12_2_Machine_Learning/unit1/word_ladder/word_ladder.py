import string
from util import *

def word_ladder_neighbors(current_word, valid_words):
    '''
    Given a word (current_word) as a string and a set of valid words,
    returns a list of words that are all one letter different 
    than current_word.
    '''

    alphabet = string.ascii_lowercase

    neighbors = []
    for i in range(len(current_word)):
        for letter in alphabet:
            neighbor = current_word[:i] + letter + current_word[i+1:]
            if neighbor in valid_words and neighbor != current_word:
                neighbors.append(neighbor)

    return neighbors

def word_ladder_search(valid_words, start_word, end_word):
    '''
    Given a list of valid words, a starting word (string), and an ending 
    word (string), returns the path of of strings representing the word ladder from
    start_word to end_word.
    '''
    start = (start_word, [start_word])
    visited = set()
    q = [start]
    while q:
        current_word, path = q.pop(0)
        if current_word == end_word:
            return path, len(visited)
        if current_word not in visited:
            visited.add(current_word)
            for neighbor in word_ladder_neighbors(current_word, valid_words):
                if neighbor not in visited:
                    q.append((neighbor, path + [neighbor]))
    return None

def better_word_ladder_search(valid_words, start_word, end_word):
    '''
    Given a list of valid words, a starting word (string), and an ending 
    word (string), returns the path of of strings representing the word ladder from
    start_word to end_word. This search should use heuristic_function to speed up
    the search.
    '''
    start = (start_word, [start_word])
    visited = set()
    q = PriorityQueue()
    q.update(start, 0)
    while q:
        current_word, path = q.pop()
        if current_word == end_word:
            return path, len(visited)
        if current_word not in visited:
            visited.add(current_word)
            for neighbor in word_ladder_neighbors(current_word, valid_words):
                if neighbor not in visited:
                    neighbor_state = (neighbor, path + [neighbor])
                    priority = heuristic_function(neighbor_state, end_word)
                    q.update(neighbor_state, priority)
    return None

def heuristic_function(state, end_word):
    return sum([1 for i in range(len(state[0])) if state[0][i] != end_word[i]])


if __name__=="__main__":
    # valid_words is a set containing all strings that should be considered valid
    # words (all in lower-case)
    with open('words_alpha.txt') as f:
        valid_words = {i.strip() for i in f}

    print("You have", len(valid_words), "words to work with.")

    # Example usage:

    start = "atlases"
    end =   "cabaret"

    path, num_expanded = word_ladder_search(valid_words, start, end)
    path2, num_expanded2 = better_word_ladder_search(valid_words, start, end)

    print("The path from", start, "to", end, "is:")
    print(path2)

    print("The number of nodes expanded is:", num_expanded2)

