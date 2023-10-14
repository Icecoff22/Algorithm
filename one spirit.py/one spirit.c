#include<stdio.h>
#pragma warning (disable:4996)

int main(){
    int n, m;
    scanf("%d %d",&n,&m);
    
    int maxCntOfDivisor = -1, maxCnt = -1, maxNum = -1;

    for(int i=n;i<=m;i++){
        int k=i;
        int cond = 2;
        int cnt = 0;//약수 지수의 합
        int cntOfDivisor = 1;//약수의 개수

        while(k != 1){
            int chk = 1;
            while(k % cond == 0){
                k /= cond;
                cnt++;
                chk++;
            }
            cntOfDivisor *= chk;
            cond++;
        }
        if(cntOfDivisor > maxCntOfDivisor){
            maxCntOfDivisor = cntOfDivisor;
            maxNum = i;
            maxCnt = cnt;
        }
    }
    printf("%d %d %d",maxNum, maxCntOfDivisor, maxCnt);
}