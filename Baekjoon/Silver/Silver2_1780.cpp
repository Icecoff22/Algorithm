#include<iostream>
#include<cstdlib>

using namespace std;

int arr[2200][2200]={0, };
int arr_[3]={0, };

bool same(int x, int y, int n){
    int check = arr[x][y];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr[x+i][y+j]!=check){
                return false;
            }
        }
    }
    return true;
}

void sol(int x, int y, int n){
    if(same(x,y,n)){
        int num = arr[x][y];
        arr_[num+1]++;
        return;
    }
    int div = n/3;

    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            sol(x+div*i,y+div*j,div);
        }
    }
}

int main(){
    int N;
    cin >> N;
    
    for(int i=0;i<N;i++){
         for(int j=0;j<N;j++){
           cin >> arr[i][j];
        }
    }
    sol(0,0,N);

    for(int i=0;i<3;i++){
        cout << arr_[i]<<"\n";
    }
}