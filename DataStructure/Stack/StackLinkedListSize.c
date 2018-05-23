#include <stdio.h>
#include <stdlib.h>

typedef int element;
typedef struct StackNode {
    element item;
    struct StackNode *link;
}StackNode;

typedef struct {
    StackNode *top;
} LinkedStackType;

void init(LinkedStackType *s){
    s->top = NULL;
}

int is_empty(LinkedStackType *s){
    return (s->top == NULL);
}

void push(LinkedStackType *s, element item){
    StackNode * temp = (StackNode *)malloc(sizeof(StackNode));
    if(temp == NULL){
        fprintf(stderr, "메모리 할당에러\n");
        return;
    }
    else{
        temp->item = item;
        temp->link = s->top;
        s->top = temp;
    }
}

element pop(LinkedStackType *s){
    if(is_empty(s)){
        fprintf(stderr, "스택이 비어있음\n");
        exit(1);
    }
    else{
        StackNode *temp = s->top;
        element item = temp->item;
        s->top = s->top->link;
        free(temp);
        return item;
    }
}

element peek(LinkedStackType *s){
    if(is_empty(s)){
        fprintf(stderr, "스택이 비어있음\n");
        exit(1);
    }else{
        return s->top->item;
    }
}

// size 함수
int stackSize(LinkedStackType *s) {
    StackNode *temp=s->top;
    int count=0;
    while(temp != NULL ) {
        count++;
        temp = temp->link;
    }
    return(count);
}



void main(){
    LinkedStackType s;

    init(&s);
    push(&s,1);
    push(&s,2);
    push(&s,3);

    printf("size = %d\n", stackSize(&s));

}