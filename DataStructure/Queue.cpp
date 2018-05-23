#include<iostream>
#include<queue>
using namespace std;
int main() {
     queue<int> q;
     q.push(1);
     q.push(2);
     cout << q.front();
     q.pop();
     cout << q.front();
}
