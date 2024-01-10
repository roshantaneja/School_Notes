---
tags:
  - ATCS
  - CS
  - software
---

# main.cpp

```cpp
#include <iostream>  
#include <fstream>  
#include <string>  
  
using namespace std;  
  
struct TreeNode {  
    string value;  
    TreeNode *left;  
    TreeNode *right;  
    TreeNode(string val) {  
        value = val;  
        left = nullptr;  
        right = nullptr;  
    }  
    TreeNode() {  
        left = nullptr;  
        right = nullptr;  
    }  
};  
  
void loadFile(ifstream& f, TreeNode*& root);  
void saveFile(ofstream& f, TreeNode* root);  
  
void playGame(TreeNode* root);  
void newCity(TreeNode *pos);  
  
int numLeaves(TreeNode* root);  
  
int main() {  
    cout << "City Guessing Game" << endl << endl;  
    cout << "Welcome to the city City Guessing Game!" << endl;  
    string filename;  
    cout << "Enter the name of the data file:";  
    getline(cin, filename);  
    TreeNode* root = nullptr;  
    ifstream f(filename);  
  
    // continue here  
  
    cout << "Loading data file..." << endl;  
  
    loadFile(f, root);  
  
    int numLeaf = numLeaves(root);  
  
    cout << "Loading " << numLeaf << " cities complete!" << endl;  
  
    playGame(root);  
  
    cout << "Do you want to save the current City data to a file? (y/n)" << endl;  
  
    string a;  
    getline(cin, a);  
  
    if (a == "y"){  
        cout << "Enter the name of the file to save to:" << endl;  
        string filename;  
        getline(cin, filename);  
        ofstream f(filename);  
        cout << "Saving data file..." << endl;  
        saveFile(f, root);  
        int numSaved = numLeaves(root);  
        cout << "Saving " << numSaved <<" cities complete!" << endl;  
    }  
  
    cout << "Good bye!" << endl;  
  
    return 0;  
}  
  
void loadFile(ifstream& f, TreeNode*& root) {  
    string line;  
    getline(f, line);  
    root = new TreeNode();  
    root->value = line.substr(1);  
    if(line[0] == 'A') {  
        root->left = nullptr;  
        root->right = nullptr;  
        return;  
    } else {  
        loadFile(f, root->left);  
        loadFile(f, root->right);  
    }  
}  
  
void saveFile(ofstream& f, TreeNode* root){  
    if (root->left == nullptr && root->right == nullptr){  
        f << "A" << root->value << endl;  
    } else {  
        f << "Q" << root->value << endl;  
        saveFile(f, root->left);  
        saveFile(f, root->right);  
    }  
}  
  
void playGame(TreeNode* root){  
    cout << "Think of a city, press enter when youre ready to being" << endl;  
    string a;  
    getline(cin, a); // wait for user to press enter  
  
    bool playing = true;  
  
    TreeNode* pos = root;  
  
    while (playing){  
        if (pos->left == nullptr && pos->right == nullptr){ // if you're at a leaf  
            cout << "Is it " << pos->value << "? (y/n)" << endl;  
            getline(cin, a);  
            if (a == "y"){  
                cout << "I win!" << endl;  
                playing = false;  
            } else { // assuming anything other than y is a no  
                newCity(pos);  
            }  
            cout << "Do you want to play again? (y/n)" << endl;  
            getline(cin, a);  
            if (a == "y"){  
                playing = true;  
                pos = root;  
            } else {  
                playing = false;  
            }  
        } else {  
            cout << pos->value << endl;  
            getline(cin, a);  
            if (a == "y"){  
                pos = pos->left;  
            } else {  
                pos = pos->right;  
            }  
        }  
    }  
  
}  
  
void newCity(TreeNode *pos) {  
    cout << "I lose. What city were you thinking of?" << endl;  
    string city;  
    getline(cin, city);  
    cout << "What question would distinguish " << city << " from " << pos->value << "?" << endl;  
    string question;  
    getline(cin, question);  
    cout << "What is the answer for " << city << "?" << endl;  
    string answer;  
    getline(cin, answer);  
    TreeNode* newCity = new TreeNode(city);  
    TreeNode* oldCity = new TreeNode(pos->value);  
    if (answer == "y"){ // assuming anything other than y is a no  
        pos->left = newCity; // if the answer is yes, the new city is the left child  
        pos->right = oldCity; // and the old city is the right child (wrong)  
        pos->value = question; // and the value of the node is the question  
    } else {  
        pos->left = oldCity; // if the answer is no, the new city is the right child  
        pos->right = newCity; // and the old city is the left child (correct)  
        pos->value = question; // and the value of the node is the question  
    }  
}  
  
int numLeaves(TreeNode* root){  
    if (root->left == nullptr && root->right == nullptr){  
        return 1;  
    } else {  
        return numLeaves(root->left) + numLeaves(root->right);  
    }  
}
```