#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 10000
#define SWAP(x, y, t) ( (t)=(x), (x)=(y), (y)=(t))

int list[MAX_SIZE];
int n;

void selection_sort(int list[], int n){
    int i, j, least, temp;
    for(i=0; i<n-1; i++){
        least = i;
        for(j=i+1; j<n; j++) //최솟값 탐색
            if(list[j]<list[least]) least = j;
        SWAP(list[i], list[least], temp);
    }
}

void main(){
    int i;
    n= MAX_SIZE;
    for(i=0; i<n; i++) // 난수 생성 및 출력
        list[i] = rand()%n; // 난수 발생 범위 0~n-1
    selection_sort(list, n); // 선택 정렬 호출

    for(i=0; i<n; i++)   // 정렬 결과 출력
        printf("%d\n", list[i]);
}