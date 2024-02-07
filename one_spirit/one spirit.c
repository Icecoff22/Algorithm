#pragma warning(disable:4996)
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    int n;
    char *ch[10] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    char *ch2[4] = { "TEN", "HUN", "THO" };
    scanf("%d", &n);
    int cnt = 0;
    int num = n;
    int div = 1;
    while (num > 0) {   // n의 자릿수 세기
        num /= 10;
        cnt++;
    }
    for(int i=1;i<cnt;i++)
        div *= 10;

    while (div > 1) {
        if(n/div!=0)
            printf("%s %s ",ch[(n/div)-1],ch2[cnt-2]);
        n = n%div;
        div/=10;
        cnt-=1;
    }
    if(n%10!=0)
        printf("%s\n",ch[n-1]);
    else
        printf("\n");
    return 0;
}