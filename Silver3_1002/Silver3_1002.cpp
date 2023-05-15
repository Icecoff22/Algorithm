#include<iostream>
#include<cmath>

using namespace std;

int main(){
    int x1, x2, y1, y2, r1, r2;
    int N;
    cin >> N;
    for(int i=0;i<N;i++){
        cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;
        double dis = sqrt(pow(x2-x1,2)+pow(y2-y1,2));
        if(x1 == x2 && y1 == y2 && r1 == r2)//infinite
            cout << -1 << '\n';
        else if(dis>r1+r2||abs(r1-r2)>dis)//0
            cout << 0 << '\n';
        else if(dis==r1+r2||abs(r1-r2)==dis)
            cout << 1 << '\n';
        else
            cout << 2 << '\n';
    }
}