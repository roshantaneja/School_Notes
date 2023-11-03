---
tags:
  - ATCS
  - software
  - notes
---
# moviemain.cpp
```cpp
#include <iostream>  
#include <fstream>  
#include "shphashtable.h"  
  
using namespace std;  
  
void loadFile (shphashtable &reviews){  
    ifstream f("reviews.txt");  
  
    int rating;  
    string review;  
  
    while (f>>rating){  
        getline(f, review);  
        string word = "";  
        for (int i = 0; i < review.length();i++){  
            if (review[i] == ' ') {  
                if (word.length() >= 0 && isalpha(word[0])) {  
                    reviews.put(word, rating);  
                }  
                word = "";  
            } else {  
                word += review[i];  
            }  
        }  
    }  
}  
  
void getReviewRating(const shphashtable & reviews){  
    cout << endl << "ENTER A REVIEW:" << endl;  
    string review;  
    getline(cin, review);  
    review += " ";  
  
    string word = "";  
    double sum = 0;  
    int count = 0;  
  
    for (int i=0; i<review.length(); i++){  
        if (review[i] == ' '){  
            if (word != ""){  
                if (reviews.contains(word)){  
                    sum += reviews.getAverageRating(word);  
                    //cout << word << " = " << reviews.getAverageRating(word) << endl;  
                    // for debugging purposes                    count++;  
                }  
            }  
            word = "";  
        }  
        else word += review[i];  
    }  
    sum += reviews.getAverageRating(word);  
    count++;  
    cout << "RATING = " << (1.0 * sum)/count << endl;  
}  
  
  
int main() {  
    cout << "Hello, Movie Reviews!" << endl;  
    shphashtable reviews(20003);  
    // load review data here, probably in a function  
  
    loadFile(reviews);  
    reviews.printStats();  
  
    getReviewRating(reviews);  
  
    return 0;  
}
```
# shphashtable.h
```cpp
#ifndef HASHTABLEMOVIEREVIEWER_SHPHASHTABLE_H  
#define HASHTABLEMOVIEREVIEWER_SHPHASHTABLE_H  
#include <string>  
#include <utility>  
#include "WordEntry.h"  
  
using namespace std;  
  
class shphashtable {  
  
public:  
    shphashtable(int numBuckets);  
    ~shphashtable();  
    bool contains(string str) const;  
    void put(string str, int rating);  
    void printStats() const;  
    double getAverageRating(string str) const;  
  
private:  
    struct Node {  
        WordEntry value;  
        Node* next;  
        Node(string str, int rating):value(str, rating) {  
            next == nullptr;  
        }  
    };  
    Node** buckets = nullptr;  
    int size;  
    int getHashCode(string str) const;  
    Node* getPointer(string str) const;  
  
};  
  
  
#endif //HASHTABLEMOVIEREVIEWER_SHPHASHTABLE_H
```

# shphashtable.cpp
```cpp
#include "shphashtable.h"  
#include <string>  
#include <iostream>  
  
using namespace std;  
  
shphashtable::shphashtable(int numBuckets) {  
    buckets = new Node*[numBuckets];  
    for (int i = 0; i < numBuckets; i++) {  
        buckets[i] = nullptr;  
    }  
    size = numBuckets;  
}  
  
shphashtable::~shphashtable() {  
    for (int i = 0; i < size; i ++){  
        while (buckets[i]){  
            Node* save = buckets[i];  
            buckets[i] = buckets[i]->next;  
            delete save;  
        }  
    }  
    delete[] buckets;  
}  
  
bool shphashtable::contains(string str) const{  
    return getPointer(str);  
}  
  
void shphashtable::put(string str, int rating) {  
    Node* pointer = getPointer(str);  
    if (pointer == nullptr) {  
        int index = getHashCode(str);  
        Node *save = buckets[index];  
        buckets[index] = new Node(str, rating);  
        buckets[index]->next = save;  
    } else {  
        pointer->value.addScore(rating);  
    }  
}  
  
  
  
void shphashtable::printStats() const {  
    int usedBuckets = 0;  
    int emptyBuckets = 0;  
    int longestChain = 0;  
    int totalChainLength = 0;  
    int numCollisions = 0;  
    int totalWords = 0;  
    for (int i=0; i<size; i++){  
        if (buckets[i]){  
            usedBuckets++;  
            int chainLength = 0;  
            Node* ptr = buckets[i];  
            while(ptr){  
                chainLength++;  
                ptr = ptr->next;  
            }  
            totalWords += chainLength;  
            if (chainLength > longestChain) longestChain = chainLength;  
            totalChainLength += chainLength;  
            numCollisions += chainLength - 1;  
        }  
        else emptyBuckets++;  
    }  
    cout << "NUM BUCKETS = " << size << endl;  
    cout << "TOTAL WORDS = " << totalWords << endl;  
    cout << "NUM EMPTY BUCKETS = " << emptyBuckets << endl;  
    cout << "LONGEST CHAIN = " << longestChain << endl;  
    cout << "AVG CHAIN LENGTH = " << 1.0 * totalChainLength / usedBuckets << endl;  
}  
  
int shphashtable::getHashCode(string str) const {  
    hash<string> hashFunction;  
    return hashFunction(str) % size;  
}  
  
shphashtable::Node *shphashtable::getPointer(string str) const {  
    Node* pointer = buckets[getHashCode(str)];  
    while (pointer != nullptr){  
        if (pointer->value.getWord() == str){  
            return pointer;  
        } else {  
            pointer = pointer->next;  
        }  
    }  
    return nullptr;  
}  
  
double shphashtable::getAverageRating(string str) const {  
    return contains(str) ? getPointer(str)->value.getAvgScore() : 2.0;  
}
```
# WordEntry.h
```cpp
#ifndef HASHTABLEMOVIEREVIEWER_WORDENTRY_H  
#define HASHTABLEMOVIEREVIEWER_WORDENTRY_H  
#include <string>  
  
using namespace std;  
  
class WordEntry {  
public:  
    WordEntry(string str, int score);  
    string getWord() const;  
    double getAvgScore() const;  
    void addScore(int score);  
  
private:  
    string word;  
    int totalStars;  
    int numRatings;  
  
};  
  
  
#endif //HASHTABLEMOVIEREVIEWER_WORDENTRY_H
```
# WordEntry.cpp
```cpp
#include "WordEntry.h"  
using namespace std;  
  
  
WordEntry::WordEntry(string str, int score) {  
    word = str;  
    totalStars = score;  
    numRatings = 1;  
}  
  
string WordEntry::getWord() const {  
    return word;  
}  
  
double WordEntry::getAvgScore() const {  
    return (1.0 * totalStars) / numRatings;  
}  
  
void WordEntry::addScore(int score) {  
    totalStars += score;  
    numRatings ++;  
}
```
