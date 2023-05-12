#include<iostream>
#include<algorithm>

using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    string N;
    int sum=0;
    cin >> N;
    sort(N.begin(),N.end(),greater<>());
    for(auto o:N)
        sum += o-'0';
    if(sum%3!=0 || N.length()<2 || N.back()!='0')
        cout << -1;
    else  
        cout << N;
}