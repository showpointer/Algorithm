//// BubbleSort
//
//#include <iostream>
//
//using namespace std;
//
//#define ARR_SIZE 5
//
//void print(int arr[]){
//    for(int i=0; i < ARR_SIZE; i++){
//        cout << arr[i] << " ";
//    }
//}
//
//void bubbleSort(int arr[]){
//    int tmp;
//    for(int i=0; i < ARR_SIZE-1; i++){
//        for(int j=0; j < ARR_SIZE-1-i; i++){
//            if(arr[j] > arr[j+1]) {
//                tmp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = tmp;
//            }
//        }
//    }
//    print(arr);
//}
//
//int main(){
//
//    int arr[ARR_SIZE] = {5, 3, 4, 9, 1};
//    int loop;
//
//    bubbleSort(arr);
//
//    return 0;
//}