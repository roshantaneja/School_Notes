---
tags:
  - CS
  - ATCS
  - homework
---



# main.cpp
```cpp
#include <fstream>  
#include <iostream>  
#include <string>  
  
using namespace std;  
  
// you'll need this somewhere; it should go in the private section of your class  
// if you opt to do it that way  
struct Node {  
    string name;  
    int num;  
    Node* next;  
};  
  
// just a suggestion: I found it useful to have this function  
// returns a pointer to the Node containing that name, or nullptr // if that Pokemon is not in the list anywhere  
Node* find(Node* head, string name);  
Node* more(Node* &head, string name, int num);  
void print (Node* head);  
void save(Node* head, string filename);  
  
int main() {  
    cout << "=== WELCOME TO POKEMON! ===" << endl;  
    Node* head = nullptr;  
  
    string filename;  
    cout << "Enter a file name: ";  
    cin >> filename;  
  
    ifstream f(filename);  
    int num;  
    string name;  
    while (f >> num) {  
        getline(f, name);  
        more(head, name.substr(1), num);  
    }  
    f.close();  
  
    int input;  
    while(true){  
        cout << " 1. Add a new Pokemon" << endl 
	        << "  2. Remove a Pokemon" << endl 
	        << "  3. Lookup Pokemon" << endl 
	        << "  4. save changes" << endl 
	        << "  5. Quit" << endl 
	        << "Enter a choice: ";
        cin >> input;  
        cin.ignore();  
        if (input == 1) {  
            cout << "Enter a Pokemon name: ";  
            getline(cin, name);  
            cout << endl;  
            cout << "How many " << name << " do you want to add? ";  
            cin >> num;  
            cin.ignore();  
            cout << endl;  
            more(head, name, num);  
            cout << "Pokemon added." << endl;  
        } else if (input == 2) {  
            cout << "Enter a Pokemon name: ";  
            getline(cin, name);  
            Node* searched = find(head, name);  
            if(searched == nullptr) {  
                cout << "Pokemon not found." << endl;  
            } else {  
                more(head, name, -searched->num - 1);  
                cout << "Pokemon removed." << endl;  
            }  
        } else if (input == 3) {  
            cout << "Enter a Pokemon name: ";  
            getline(cin, name);  
            Node* searched = find(head, name);  
            if(searched == nullptr) {  
                cout << "Pokemon not found." << endl;  
            } else {  
                cout << searched->name << " : " << searched->num << endl;  
            }  
        } else if (input == 4) {  
            //save changes  
            cout << "Enter a file name: ";  
            cin >> filename;  
            save(head, filename);  
            cout << "Changes saved." << endl;  
        } else if (input == 5){  
            break;  
        } else {  
            cout << "Invalid choice." << endl;  
        }  
    }  
  
    return 0;  
}  
  
Node* find(Node* head, string name) {  
    Node* current = head;  
    while (current != nullptr) {  
        if (current->name == name) {  
            return current;  
        }  
        current = current->next;  
    }  
    return nullptr;  
}  
  
Node* more(Node* &head, string name, int num) {  
    Node* searched = find(head, name);  
    if(searched == nullptr) {  
        //make new node and add to list  
        Node* newNode = new Node;  
        newNode->name = name;  
        newNode->num = num;  
        newNode->next = head;  
        head = newNode;  
        return newNode;  
    }  
  
    searched->num += num;  
    if (searched->num >= 0) {  
        return searched;  
    } else {  
        //remove node  
        Node* current = head;  
        if (current == searched) {  
            head = current->next;  
            delete current;  
        }  
        while (current->next != searched) {  
            current = current->next;  
        }  
        current->next = searched->next;  
        delete searched;  
    }  
    return nullptr;  
}  
  
void print(Node* head){  
    Node* current = head;  
    while (current != nullptr) {  
        cout << current->name << " : " << current->num << " " << endl;  
        current = current->next;  
    }  
    cout << endl;  
}  
  
void save(Node* head, string filename){  
    ofstream f(filename);  
    Node* current = head;  
    while (current != nullptr) {  
        f << current->num << " " << current->name << endl;  
        current = current->next;  
    }  
    f.close();  
}
```