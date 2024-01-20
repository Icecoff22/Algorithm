#include<iostream>

using namespace std;

int main(){
    int N;
    int * arr = new int[N+1];
    cin >> N;
    arr[0] = 1;
    arr[1] = 1;
    for(int i=2;i<=N;i++)
        arr[i]=(arr[i-1]+arr[i-2])%15746;
    cout << arr[N] << '\n';
    
}
