#include <stdio.h>

#define MAX_QUEUE_SIZE 3
typedef int element;
typedef struct {
    element queue[MAX_QUEUE_SIZE];
    int front, rear;
} QueueType;

void error(char *message){
    fprintf(stderr, "%s\n", message);
    exit(1);
}

// 초기화 함수
void init(QueueType *q){
    q->front = q->rear = 0;
}

// 공백 상태 검출 함수
int is_empty(QueueType *q){
    return (q->front == q-> rear);
}

// 포화 상태 검출 함수
int is_full(QueueType *q){
    return ((q->rear+1)%MAX_QUEUE_SIZE == q->front);
}

// 삽입 함수
void enqueue(QueueType *q, element item){
    if(is_full(q))
        error("큐가 포화상태입니다");
    q->rear = (q->rear+1) % MAX_QUEUE_SIZE;
    q->queue[q->rear] = item;
}

// 삭제 함수
element dequeue(QueueType *q){
    if(is_empty(q))
        error("큐가 공백상태입니다");
    q->front = (q->front+1)% MAX_QUEUE_SIZE;
    return q->queue[q->front];
}

// 피크 함수
element peek(QueueType *q){
    if(is_empty(q))
        error("큐가 공백상태입니다.");
    return q->queue[(q->front+1) % MAX_QUEUE_SIZE];
}

int fib(int n, QueueType q){
    int fibN2;
    int fibN1;
    if(n == 0) return dequeue(&q);
    else if(n == 1) return dequeue(&q) + peek(&q);

    for(int i = 2; i <= n; i++){
        fibN2 = dequeue(&q);
        fibN1 = peek(&q);
        enqueue(&q, fibN1 + fibN2);
    }
    dequeue(&q);
    return peek(&q);
}

// 주함수
int main(){
    int n;
    int ret;
    scanf("%d", &n);

    QueueType q;
    init(&q);

    enqueue(&q, 0);
    enqueue(&q, 1);
    ret = fib(n, q);
    printf("%d", ret);

    return 0;
}