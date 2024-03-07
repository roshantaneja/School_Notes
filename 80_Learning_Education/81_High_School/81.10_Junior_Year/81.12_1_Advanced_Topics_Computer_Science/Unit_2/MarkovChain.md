---
tags:
  - software
  - CS
  - ATCS
  - homework
---
# main.txt
```cpp
#include <iostream>  
#include <fstream>  
#include <map>  
#include <set>  
#include <vector>  
using namespace std;  
  
void buildMap(string filename, int order, map<string, vector<char>> &markovMap);  
  
string generateText(map<string, vector<char>> &markovMap);  
  
int main() {  
    srand(time(0));  
    map<string, vector<char>> markovMap;  
    cout << "Hello, Markov Chain!" << endl;  
    cout << "Enter level (1-10):";  
    int level;  
    cin >> level;  
    cout << "Enter file name:";  
    string filename;  
    cin >> filename;  
  
    buildMap(filename, level, markovMap);  
  
    cout  
    << "Built Map!"  
    << endl  
    << endl  
    << "============"  
    << endl  
    << endl;  
  
    cout << generateText(markovMap) << endl;  
  
    // finish this up  
    return 0;  
}  
  
  
void buildMap(string filename, int order, map<string, vector<char>> &markovMap){  
    ifstream f(filename);  
  
    if (!f.is_open()){  
        cout << "Error opening file " << filename << endl;  
        return;  
    }  
  
    string key = "";  
    char c;  
    while (f>> noskipws >> c){  
        if (key.length() < order){  
            key += c;  
        } else {  
            markovMap[key].push_back(c);  
            key = key.substr(1) + c;  
        }  
    }  
}  
  
string generateText(map<string, vector<char>> &markovMap){  
    string output = "";  
    string key = "";  
    auto iter = markovMap.begin();  
    advance(iter, rand() % markovMap.size());  
    key = iter->first;  
    output += key;  
    int sentences = 0;  
    while (sentences < 5){  
        char c = markovMap[key][rand() % markovMap[key].size()];  
        output += c;  
        if (c == '.' || c == '?' || c == '!'){  
            sentences++;  
        }  
        key = key.substr(1) + c;  
    }  
    return output;  
}
```