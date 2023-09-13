# main.cpp
```cpp
#include <iostream>  
  
using namespace std;  
  
struct Node {  
    Node(int num, Node* nextPtr) {  
        value = num;  
        next = nextPtr;  
    }  
  
    Node(int num) {  
        value = num;  
        next = nullptr;  
    }  
  
    Node(){  
        value = 0;  
        next = nullptr;  
    }  
  
    int value;  
    Node* next;  
};  
  
int sum(Node* head);  
int length(Node* head);  
void print(Node* head);  
void removeLast(Node* &head);  
bool mostlyEven(Node* head);  
int count(Node* head, int target);  
void insertAtBeginning(Node* &head, int value);  
void insertAtEnd(Node* &head, int value);  
void removeDoubleDigitValues(Node* &head);  
void destroyList(Node* &head);  
//homework  
void doubleValues(Node* head);  
void doubleNodes(Node* &head);  
void reverse(Node* &head);  
//testprep  
bool mostlyOdd(Node* head);  
void moveToFront(Node* &head, int target);  
Node* duplicate(Node* head);  
//test  
int countFirstValue(Node* head);  
void removeDuplicates(Node* head);  
Node* extractBetween(Node* head, int startNum, int endNum);  
  
  
int main() {  
    cout << "Hello, LinkedList!" << endl;  
  
    Node* head = nullptr;  
  
    cout << "enter numbers, negative or 0 to quit" << endl;  
    int num;  
    cin >> num;  
    while (num > 0) {  
        Node* temp = head;  
        head = new Node;  
        head->value = num;  
        head->next = temp;  
        cin >> num;  
    }  
  
    print(head);  
  
    cout << countFirstValue(head) << endl;  
  
    //removeDuplicates(head);  
  
    Node* extracted = extractBetween(head, 25, 50);  
  
    print(head);  
  
    print(extracted);  
  
    destroyList(head);  
  
    return 0;  
  
  
}  
  
int sum(Node* head) {  
    int sum = 0;  
    Node* current = head;  
    while (current != nullptr) {  
        sum += current->value;  
        current = current->next;  
    }  
    return sum;  
}  
  
int length(Node* head) {  
    int length = 0;  
    Node* current = head;  
    while (current != nullptr) {  
        length++;  
        current = current->next;  
    }  
    return length;  
}  
  
void print (Node* head){  
    Node* current = head;  
    while (current != nullptr) {  
        cout << current->value << " ";  
        current = current->next;  
    }  
    cout << endl;  
}  
  
void removeLast(Node* &head) {  
    if (head == nullptr) {  
        return;  
    } else if (head->next == nullptr) {  
        delete head;  
        head = nullptr;  
    } else {  
        Node *current = head;  
        while (current->next->next != nullptr) {  
            current = current->next;  
        }  
        delete current->next;  
        current->next = nullptr;  
  
    }  
}  
  
bool mostlyEven(Node* head){  
    int numEvens = 0;  
    int numOdds = 0;  
    Node* current = head;  
    while (current != nullptr) {  
        if (current->value % 2 == 0) {  
            numEvens++;  
        } else {  
            numOdds++;  
        }  
        current = current->next;  
    }  
    return numEvens > numOdds;  
}  
  
void insertAtBeginning(Node* &head, int value){  
    Node* temp = head;  
    head = new Node(value, temp);  
}  
  
void insertAtEnd(Node* &head, int value){  
    if (head == nullptr) {  
        head = new Node(value);  
        return;    }  
    Node* current = head;  
    while (current->next != nullptr) {  
        current = current->next;  
    }  
    current->next = new Node(value);  
}  
  
void removeDoubleDigitValues(Node* &head) {  
    while (head != nullptr && head->value >= 10 && head->value <= 99) {  
        Node* save = head;  
        head = head->next;  
        delete save;  
    }  
    if (head == nullptr) {  
        return;  
    }  
    Node* current = head;  
    while (current->next != nullptr) {  
        if (current->next->value >= 10 && current->next->value <= 99) {  
            Node* save = current->next;  
            current->next = current->next->next;  
            delete save;  
        } else {  
            current = current->next;  
        }  
    }  
}  
  
void destroyList(Node* &head){  
    while (head != nullptr) {  
        Node* save = head;  
        head = head->next;  
        delete save;  
    }  
}  
  
void doubleValues(Node* head){  
    Node* current = head;  
    while (current != nullptr) {  
        current->value *= 2;  
        current = current->next;  
    }  
}  
  
void doubleNodes(Node* &head){  
    Node* current = head;  
    while (current != nullptr) {  
        Node* temp = current->next;  
        current->next = new Node(current->value, temp);  
        current = temp;  
    }  
}  
  
void reverse(Node* &head){  
    Node* newList = nullptr;  
    Node* current = head;  
    while (current != nullptr) {  
        insertAtBeginning(newList, current->value);  
        current = current->next;  
    }  
    destroyList(head);  
    head = newList;  
}  
  
bool mostlyOdd(Node*  head){  
    int evenNums = 0;  
    int oddNums = 0;  
    Node* temp = head;  
    while (temp != nullptr){  
        if (temp->value % 2 == 1){  
            oddNums++;  
        } else {  
            evenNums++;  
        }  
        temp = temp->next;  
    }  
    return (oddNums > evenNums);  
}  
  
void moveToFront(Node* &head, int target){  
    if (head == nullptr || head->next == nullptr)  
        return;  
    Node* temp = head;  
    while (temp->next != nullptr) {  
        if (temp->next->value == target) {  
            Node *save = temp->next;  
            temp->next = temp->next->next;  
            save->next = head;  
            head = save;  
        } else {  
            temp = temp->next;  
        }  
    }  
}  
  
Node* duplicate(Node* head){  
    Node* newHead = nullptr;  
    Node* temp = head;  
    while (temp != 0){  
        insertAtEnd(newHead, temp->value);  
        temp = temp-> next;  
    }  
  
    return newHead;  
}  
  
int count(Node* head, int target){  
    int count = 0;  
    Node* current = head;  
    while (current != nullptr) {  
        if (current->value == target){  
            count++;  
        }  
        current = current->next;  
    }  
    return count;  
}  
  
//test  
  
int countFirstValue(Node* head){  
    if (head == nullptr){  
        return 0;  
    }  
    return count(head, head->value);  
}  
  
void removeDuplicates(Node* head){  
    if(head == nullptr){  
        return;  
    }  
    Node* first = head;  
    Node* second = head->next;  
    while (second != nullptr){  
        if (first->value == second->value){  
            first->next = second->next;  
            delete second;  
            second = first->next;  
        } else {  
            first = second;  
            second = second->next;  
        }  
    }  
}  
  
Node* extractBetween(Node* head, int startNum, int endNum){  
    Node* newList = nullptr;  
    // find startNum Node  
    Node* startNode = head;  
    while(startNode != nullptr && startNode->value != startNum){  
        startNode = startNode->next;  
    }  
    if (startNode == nullptr){  
        return newList;  
    }  
  
    // find endNum Node  
    Node* endNode = startNode; // so that it doesn't find an earlier one  
    while(endNode != nullptr && endNode->value != endNum){  
        endNode = endNode->next;  
    }  
    if (endNode == nullptr){  
        return newList;  
    }  
  
    newList = startNode->next;  
  
    startNode->next = endNode;  
  
    //iterate through and "sever" the extracted list  
  
    Node* curr = newList;  
    while(curr->next != endNode){  
        curr = curr-> next;  
    }  
  
    curr -> next = nullptr;  
  
    return newList;  
  
} 
```