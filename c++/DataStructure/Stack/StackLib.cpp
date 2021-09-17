//첫 줄에 명령어의 개수 N이 주어집니다. (1 ≤ N ≤ 1,000,000)
//두번째 줄부터 N개의 줄에 걸쳐 아래의 명령어가 입력됩니다.
//push x : x를 스택에 삽입합니다.
//pop : 가장 마지막에 들어온 인자를 삭제합니다.
//size : 큐의 크기를 출력합니다.
//top : 큐의 맨 앞 인자 값을 출력합니다.

#include <stack>
#include <iostream>
#include <string>
using namespace std;

int N, val;
string cmd;
int main() {
    stack<int> st;

    cin >> N;
    for (int i = 0; i < N; i++) {
        cin >> cmd;
        if (cmd[0] == 's') {
            cout << st.size() << endl;
        } else if (cmd[0] == 'p') {
            if (cmd[1] == 'u') {
                cin >> val;
                st.push(val);
            } else if (cmd[1] == 'o') {
                st.pop();
            }
        } else if (cmd[0] == 't') {
            cout << st.top() << endl;
        }
    }

    return 0;
}