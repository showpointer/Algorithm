// https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV14jJh6ACYCFAYD&categoryId=AV14jJh6ACYCFAYD&categoryType=CODE&&&
#include <cstdio>
#include <iostream>
#include <map>

using namespace std;

map<string, int> m;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    m.insert(pair<string, int>("ZRO", 0));
    m.insert(pair<string, int>("ONE", 1));
    m.insert(pair<string, int>("TWO", 2));
    m.insert(pair<string, int>("THR", 3));
    m.insert(pair<string, int>("FOR", 4));
    m.insert(pair<string, int>("FIV", 5));
    m.insert(pair<string, int>("SIX", 6));
    m.insert(pair<string, int>("SVN", 7));
    m.insert(pair<string, int>("EGT", 8));
    m.insert(pair<string, int>("NIN", 9));

    int tc;
    int tcLen;
    char tcNum[3];
    string str;
    int arr[10];

    cin >> tc;
    for(int i=1; i <= tc; i++) {
        for(int init=0; init < 10; init++) arr[init] = 0;
        cin >> tcNum >> tcLen;
        for (int j = 0; j < tcLen; j++) {
            cin >> str;
            arr[m[str]]++;
        }
        cout << "#" << i << '\n';
        for(int k=0; k <10; k++){
            for(int num = 0; num < arr[k]; num++){
                if(k == 0) cout << "ZRO" << " ";
                else if(k == 1) cout << "ONE" << " ";
                else if(k == 2) cout << "TWO" << " ";
                else if(k == 3) cout << "THR" << " ";
                else if(k == 4) cout << "FOR" << " ";
                else if(k == 5) cout << "FIV" << " ";
                else if(k == 6) cout << "SIX" << " ";
                else if(k == 7) cout << "SVN" << " ";
                else if(k == 8) cout << "EGT" << " ";
                else if(k == 9) cout << "NIN" << " ";
            }
        }
    }

    return 0;
}