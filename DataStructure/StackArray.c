//첫 줄에 명령어의 개수 N이 주어집니다. (1 ≤ N ≤ 1,000,000)
//두번째 줄부터 N개의 줄에 걸쳐 아래의 명령어가 입력됩니다.
//push x : x를 스택에 삽입합니다.
//pop : 가장 마지막에 들어온 인자를 삭제합니다.
//size : 큐의 크기를 출력합니다.
//top : 큐의 맨 앞 인자 값을 출력합니다.

#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include <stdbool.h>
struct stack {
    int *data;
    int last;
    int maxsize;
};
void stack_init(struct stack *st, int sz) {
    st->maxsize = sz;
    st->last = -1;
    st->data = (int*)malloc(st->maxsize * sizeof(int));
}
int stack_size(struct stack *st) {
    return (st->last) + 1;
}
bool stack_empty(struct stack *st) {
    return stack_size(st) == 0;
}
bool stack_full(struct stack *st) {
    return stack_size(st) == st->maxsize;
}
void stack_push(struct stack *st, int val) {
    assert(!stack_full(st));
    st->data[++(st->last)] = val;
}
void stack_pop(struct stack* st) {
    assert(!stack_empty(st));
    (st->last)--;
}
int stack_top(struct stack* st) {
    assert(!stack_empty(st));
    return st->data[st->last];
}
int N, val;
char cmd[16];
int main() {
    struct stack st;
    scanf("%d", &N);
    stack_init(&st, N);
    for (int i = 0; i < N; i++) {
        scanf(" %s", cmd);
        if (cmd[0] == 's') {
            printf("%d\n", stack_size(&st));
        } else if (cmd[0] == 'p') {
            if (cmd[1] == 'u') {
                scanf("%d", &val);
                stack_push(&st, val);
            } else if (cmd[1] == 'o') {
                stack_pop(&st);
            }
        } else if (cmd[0] == 't') {
            printf("%d\n", stack_top(&st));
        }
    }

    return 0;
}