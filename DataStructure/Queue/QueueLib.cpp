//첫 줄에 명령어의 개수 N이 주어집니다. (1 ≤ N ≤ 1,000,000)
//두번째 줄부터 N개의 줄에 걸쳐 아래의 명령어가 입력됩니다.
//enqueue x : x를 큐에 삽입합니다.
//dequeue : 가장 먼저 들어온 인자를 삭제합니다.
//size : 큐의 크기를 출력합니다.
//front: 큐의 맨 앞 인자 값을 출력합니다.

#include <queue>
#include <iostream>
#include <string>
using namespace std;

int main() {
    int val,N;
    queue<int> q;
    string cmd;
    cin >> N;
    for (int i = 0; i < N; i++) {
        cin >> cmd;
        if (cmd[0] == 's') {
            cout << q.size() << endl;
        } else if (cmd[0] == 'e') {
            cin >> val;
            q.push(val);
        } else if (cmd[0] == 'd') {
            q.pop();
        } else if (cmd[0] == 'f') {
            cout << q.front() << endl;
        }
    }
    return 0;
}
