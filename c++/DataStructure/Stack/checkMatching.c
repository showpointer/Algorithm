typedef char element; /* 스택의 객체 자료형 정의 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <curses.h>

typedef struct StackNode {
    element item;
    struct StackNode *link;
} StackNode;

typedef struct {
    StackNode *top;
} LinkedStackType;

// 초기화 함수
void init(LinkedStackType *s){
    s->top = NULL;
}

// 공백 상태 검출 함수
int is_empty(LinkedStackType *s){
    return (s->top == NULL);
}

// 삽입 함수
void push(LinkedStackType *s, element item){
    StackNode *temp = (StackNode*)malloc(sizeof(StackNode));
    if( temp == NULL){
        fprintf(stderr, "메모리 할당에러\n");
        return;
    }else{
        temp->item = item;
        temp->link = s->top;
        s->top = temp;
    }
}

// 삭제 함수
element pop(LinkedStackType *s){
    if(is_empty(s)){
        fprintf(stderr, "스택 공백 에러\n");
        exit(1);
    }else{
        StackNode *temp = s->top;
        element item = temp->item;
        s->top = s->top->link;
        free(temp);
        return item;
    }
}

// 피크 함수
element peak(LinkedStackType *s){
    if(is_empty(s)){
        fprintf(stderr, "스택 공백 에러\n");
        exit(1);
    }else return s->top->item;
}

// 프로그램 5.3을 여기 포함
// 괄호 검사 함수
int check_matching(char *in){
    LinkedStackType s;
    char ch, open_ch;
    int i, n = strlen(in); // n = 문자열의 길이
    init(&s); // 스택 초기화

    for(i = 0; i < n; i++){
        ch = in[i]; // ch = 다음 문자
        switch(ch){
            case '(': case '[': case '{':
                push(&s, ch);
                break;
            case ')': case ']': case '}':
                if(is_empty(&s)) return FALSE;
                else {
                    open_ch = pop(&s);
                    if( (open_ch == '(' && ch != ')') || (open_ch == '[' && ch != ']') ||(open_ch == '{' && ch != '}')){
                        return FALSE;
                    }
                    break;
                }
        }
    }
    if(!is_empty(&s)) return FALSE; // 스택에 남아 있으면 오류
    return TRUE;
}

int main(){

    if(check_matching("{ A[(i+1)]=0; }") == TRUE)
        printf("괄호검사성공\n");
    else
        printf("괄호검사실패\n");
}