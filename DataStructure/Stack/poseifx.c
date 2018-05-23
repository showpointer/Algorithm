// 프로그램 5.3을 여기에 포함
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef int element;
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

// 후위 표기 수식 계산 함수
int eval(char exp[]){
    int op1, op2, value, i=0;
    int len = strlen(exp);
    char ch;
    LinkedStackType s;
    init(&s);
    for(i=0; i<len; i++){
        ch = exp[i];
        if( ch != '+' && ch != '-' && ch != '*' && ch != '/'){
            value = ch - '0'; // 입력이 피연산자이면 숫자로 만들어 줌
            push(&s, value);
        }
        else{
            op2 = pop(&s);
            op1 = pop(&s);
            switch(ch){ // 연산을 수행하고 스택에 저장
                case '+': push(&s, op1 + op2); break;
                case '-': push(&s, op1 - op2); break;
                case '*': push(&s, op1 * op2); break;
                case '/': push(&s, op1 / op2); break;
            }
        }
    }
    return pop(&s);
}

int main(){
    int result;
    printf("후위 표기식은 82/3-32*+\n");
    result = eval("82/3-32*+");
    printf("결과 값은 %d\n", result);
}