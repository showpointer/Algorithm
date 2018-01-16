/*
출처 : https://www.codeground.org/common/popCodegroundNote#

첫 줄에 명령어의 개수 N이 주어집니다. (1 ≤ N ≤ 1,000,000)
두 번째 줄부터 N개의 줄에 걸쳐 아래 중 하나의 명령어가 입력됩니다.
push x: x를 리스트의 끝에 추가합니다.
get x: 리스트의 x번째 원소를 출력합니다.
size: 리스트의 크기를 출력합니다.
count x: 리스트에 있는 x의 개수를 출력합니다.
clear: 리스트를 비웁니다.
 */

#include <stdio.h>
#include <list>
using namespace std;

int main() {
    int n;
    scanf("%d", &n);

    list<int> mylist;
    while(n--) {
        char command[10];
        scanf("%s", command);

        // push, get, size, count, clear
        if(command[0] == 'p') {
            int value;
            scanf("%d", &value);
            mylist.push_back(value);
        } else if(command[0] == 'g') {
            int idx;
            scanf("%d", &idx);
            list<int>::iterator it = mylist.begin();
            while(idx--) {
                it++;
            }
            printf("%d\n", *it);
        } else if(command[0] == 's') {
            printf("%d\n", mylist.size());
        } else if(command[1] == 'o') {
            int target, cnt = 0;
            scanf("%d", &target);
            for(list<int>::iterator it = mylist.begin(); it != mylist.end(); it++) {
                if(*it == target) {
                    cnt++;
                }
            }
            printf("%d\n", cnt);
        } else {
            mylist.clear();
        }
    }

    return 0;
}