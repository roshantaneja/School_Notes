---
tags:
  - CS
  - ATCS
  - homework
---
# main.cpp

```cpp
#include <iostream>  
#include <vector>  
  
using namespace std;  
  
struct TreeNode {  
    string value;  
    TreeNode *left;  
    TreeNode *right;  
    TreeNode() {  
        left = nullptr;  
        right = nullptr;  
    }  
};  
  
TreeNode* makeStudentTree() {  
    TreeNode *temp = new TreeNode;  
    temp->value = "Nick";  
    temp->left = new TreeNode;  
    temp->left->value = "Natasha";  
    temp->left->right = new TreeNode;  
    temp->left->right->value = "Neal";  
    temp->left->left = new TreeNode;  
    temp->left->left->value = "Ethan";  
    temp->left->left->right = new TreeNode;  
    temp->left->left->right->value = "Kevin";  
    temp->right = new TreeNode;  
    temp->right->value = "Roshan";  
    temp->right->left = new TreeNode;  
    temp->right->left->value = "Redmond";  
    temp->right->right = new TreeNode;  
    temp->right->right->value = "Thalia";  
    return temp;  
}  
  
int size(TreeNode *tree){  
    if (tree == nullptr){  
        return 0;  
    } else {  
        return 1 + size(tree->left) + size(tree->right);  
    }  
}  
  
int countLetters(TreeNode* tree){  
    if (tree == nullptr){  
        return 0;  
    } else {  
        return tree->value.length() + countLetters(tree->left) + countLetters(tree->right);  
    }  
}  
  
int height(TreeNode* tree){  
    if (tree == nullptr){  
        return 0;  
    } else {  
        return 1 + max(height(tree->left), height(tree->right));  
    }  
}  
  
bool contains(TreeNode* tree, string str){  
    if (tree == nullptr){  
        return false;  
    } else if (tree->value == str){  
        return true;  
    } else {  
        return contains(tree->left, str) || contains(tree->right, str);  
    }  
}  
  
bool isEqual(TreeNode* one, TreeNode* two){  
    if(one == nullptr && two == nullptr){  
        return true;  
    } else if (one == nullptr && two == nullptr){  
        return false;  
    } else {  
        return one->value == two->value  
        && isEqual(one->right, two->right)  
        && isEqual(one->left, two->left);  
    }  
}  
  
void printTree(TreeNode* tree){  
    if (tree == nullptr){  
        return;  
    } else {  
        printTree(tree->left);  
        cout << tree->value << endl;  
        printTree(tree->right);  
    }  
}  
  
string getLeftmost(TreeNode* tree){  
    if(tree == nullptr){  
        return "";  
    } else if (tree->left != nullptr){  
        return getLeftmost(tree->left);  
    } else {  
        return tree->value;  
    }  
}  
  
int countLeaves(TreeNode* tree){  
    if (tree == nullptr){  
        return 0;  
    } else if (tree-> left == nullptr && tree->right == nullptr){  
        return 1;  
    } else {  
        return countLeaves(tree->right) + countLeaves(tree->left);  
    }  
}  
  
void getVectorHelper(TreeNode* tree, vector<string>& result){  
    if (tree == nullptr){  
        return;  
    } else {  
        result.push_back(tree->value);  
        getVectorHelper(tree->left, result);  
        getVectorHelper(tree->right, result);  
    }  
}  
  
vector<string> getVector(TreeNode* tree){  
    vector<string> result;  
    getVectorHelper(tree, result);  
    return result;  
}  
  
void destroyTree(TreeNode* tree){  
    if (tree == nullptr){  
        return;  
    } else {  
        destroyTree(tree->left);  
        destroyTree(tree->right);  
        delete tree;  
    }  
}  
  
// Homework Oct 5th 2023
  
bool allEvenLength(TreeNode* tree){  
    if (tree == nullptr){  
        return true;  
    } else {  
        return tree->value.length() % 2 == 0  
        && allEvenLength(tree->left)  
        && allEvenLength(tree->right);  
    }  
}  
  
void flip(TreeNode* tree){  
    if (tree == nullptr){  
        return;  
    } else {  
        TreeNode* temp = tree->left;  //is there a better way to do this?
        tree->left = tree->right;  
        tree->right = temp;  
        flip(tree->left);  
        flip(tree->right);  
    }  
  
}  
void removeLeaves(TreeNode* &tree){  
    // remove all leaves and set them to nullptr  
    if (tree == nullptr){  
        return;  
    } else if (tree->left == nullptr && tree->right == nullptr){  
        delete tree;  
        tree = nullptr;  
    } else {  
        removeLeaves(tree->left);  
        removeLeaves(tree->right);  
    }  
}  
  
TreeNode* getFullTree(string str, int height){  
    //make a tree of level int with all values equal to str  
    if (height == 0){  
        return nullptr;  
    } else {  
        TreeNode* temp = new TreeNode;  
        temp->value = str;  
        temp->left = getFullTree(str, height - 1);  
        temp->right = getFullTree(str, height - 1);  
        return temp;  
    }  
}  
  
  
int main() {  
    cout << "Hello, Binary Trees!" << endl;  
    TreeNode *root = makeStudentTree();  
  
    cout << size(root) << endl;  
  
    cout << countLetters(root) << endl;  
  
    cout << height(root) << endl;  
  
    if (contains(root, "Redmond") ){  
        cout << "Red is there"<< endl;  
    }  
  
    if (isEqual(root, root)){  
        cout << "the same!" << endl;  
    }  
  
    printTree(root);  
  
    cout << getLeftmost(root) << endl;  
  
    cout << countLeaves(root) << endl;  
  
    vector<string> vec = getVector(root);  
  
    for (string str: vec){  
        cout << str;  
    }  
    cout << endl;  
  
    destroyTree(root);  
  
    return 0;  
}

```