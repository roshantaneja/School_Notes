---
tags:
  - ATCS
  - CS
---
# main.cpp
```cpp
#include <iostream>  
#include <set>  
#include <vector>  
#include <stack>  
#include <queue>  
#include <map>  
  
using namespace std;  
  
void removeEvens(stack<int>& numstack);  
  
void assignTask(queue<string>& taskQueue, set<string>& currentTasks);  
  
void joinClubs(map<string, set<string>>& clubMap, string lonelyStudent, string friendlyStudent);  
  
  
  
void removeFirstElements(stack<queue<int>>& s);  
  
set<string> getMostVisitedCountries(map<string, set<string>>& travelMap);  
  
int main() {  
    cout << "Hello, World!" << endl;  
  
  
    //testing joinclubs  
    map<string, set<string>> clubMap;  
    clubMap["Chess"].insert("A");  
    clubMap["Chess"].insert("B");  
    clubMap["Chess"].insert("C");  
    clubMap["Drama"].insert("A");  
    clubMap["Drama"].insert("B");  
    clubMap["Golf"].insert("B");  
    clubMap["Golf"].insert("C");  
    joinClubs(clubMap, "D", "A");  
  
    //print out clubmap  
  
    for(auto iter = clubMap.begin(); iter != clubMap.end(); iter++){  
        string club = iter->first;  
        set<string> members = iter->second;  
        cout << club << ": ";  
        for(string student :members){  
            cout << student << " ";  
        }  
        cout << endl;  
    }  
  
    //testing removeFirstElements  
    stack<queue<int>> s;  
    queue<int> q1;  
    for (int i = 0; i < 5; i++) {  
        q1.push(i);  
    }  
    s.push(q1);  
  
    //print out stack  
  
    removeFirstElements(s);  
  
    while (!s.empty()){  
        queue<int> q = s.top();  
        while (!q.empty()) {  
            cout << q.front() << " ";  
            q.pop();  
        }  
        cout << endl;  
        s.pop();  
    }  
  
    //testing getMostVisitedCountries  
  
    map<string, set<string>> travelMap;  
    travelMap["A"].insert("USA");  
    travelMap["A"].insert("Canada");  
    travelMap["A"].insert("Mexico");  
  
    travelMap["B"].insert("USA");  
    travelMap["B"].insert("Canada");  
  
  
    travelMap["C"].insert("USA");  
    //travelMap["C"].insert("Canada");  
    travelMap["C"].insert("Mexico");  
    travelMap["C"].insert("France");  
  
    set<string> freq = getMostVisitedCountries(travelMap);  
  
    for (string country : freq) {  
        cout << country << endl;  
    } 
  
  
  
  
    return 0;  
}  
  
void removeEvens(stack<int>& numstack){  
    stack<int> temp;  
    while(!numstack.empty()){  
        if(numstack.top()%2 == 1){  
            temp.push(numstack.top());  
        }  
        numstack.pop();  
    }  
  
    while(!temp.empty()){  
        numstack.push(temp.top());  
        temp.pop();  
    }  
}  
  
void assignTask(queue<string>& taskQueue, set<string>& currentTasks){  
    queue<string> temp;  
    while(!taskQueue.empty()){  
        string task = taskQueue.front();  
        if(currentTasks.count(task) == 0){  
            currentTasks.insert(task);  
            taskQueue.pop();  
            while(!temp.empty()){  
                taskQueue.push(temp.front());  
                temp.pop();  
            }  
            return;  
        } else {  
            temp.push(task);  
            taskQueue.pop();  
        }  
    }  
    taskQueue = temp;  
}  
  
map<string, set<string>> getCorrectClubMap (map<string, set<string>>& origmap){  
    map<string, set<string>> newmap;  
    for(auto iter = origmap.begin(); iter != origmap.end(); iter++){  
        string club = iter->first;  
        set<string> members = iter->second;  
        for(string student :members){  
            string member = student;  
            newmap[member].insert(club);  
        }  
    }  
    return newmap;  
}  
  
void joinClubs(map<string, set<string>>& clubMap, string lonelyStudent, string friendlyStudent){  
    for (auto iter = clubMap.begin(); iter != clubMap.end(); iter++) {  
        string club = iter->first;  
        if (clubMap[club].count(friendlyStudent) == 1) {  
            clubMap[club].insert(lonelyStudent);  
        }  
    }  
}  
  
void removeFirstElements(stack<queue<int>>& s){  
    stack<queue<int>> temp;  
    while(!s.empty()){  
        queue<int> q = s.top();  
        q.pop();  
        if(!q.empty()) {  
            temp.push(q);  
        }  
        s.pop();  
    }  
  
    //push back onto s from temp  
    while(!temp.empty()) {  
        s.push(temp.top());  
        temp.pop();  
    }  
}  
  
set<string> getMostVisitedCountries(map<string, set<string>>& travelMap){  
    map<string, int> freq;  
    int max = 0;  
    for (auto iter = travelMap.begin(); iter != travelMap.end(); iter++) {  
        string person = iter->first;  
        set<string> countries = iter->second;  
        for (string country : countries) {  
            freq[country]++;  
            if (freq[country] > max) {  
                max = freq[country];  
            }  
        }  
    }  
  
    //champ belt algo? no need, I did it above!  
    //int max = 0;  
    set<string> champBelt;  
    for (auto iter = freq.begin(); iter != freq.end(); iter++) {  
        string country = iter->first;  
        int count = iter->second;  
        if (count == max) {  
            champBelt.insert(country);  
        }  
    }  
  
    return champBelt;  
}
```