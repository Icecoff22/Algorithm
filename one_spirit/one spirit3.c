#pragma warning(disable:4996)
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main() {
    int n;
    int i;
    char current_char[101];
    char final_char[101];
    int current_cnt;
    int final_cnt = 100;

    scanf("%d",&n); // 정수형인데 getchar()를 안써서 문제가 발생***
    getchar();
    for (i = 0; i < n; i++) {
        scanf("%[^\n]",current_char);     //문자열을 입력받는 것이므로 &는 필요 없음 -> ***gets로 할 때는 문제 없었는데, scanf로 바꾸니까 출력에 문제 발생함
        current_cnt = strlen(current_char);     // 문자열의 길이를 출력하는 함수
        if (current_cnt < final_cnt) {
            final_cnt = current_cnt;
            // final_char = current_char; -> 이런 변수 형태는 단일 문자일 때만 사용 가능
            // 배열에서는 문자를 복사(대체)하기 위해서는 strcpy함수를 써야 함
            strcpy(final_char, current_char);
        }
        getchar();
    }
    puts(final_char);
    return 0;
}


/*
Program
Good
This is string
language
*/

// '\0' -> 문자열의 끝을 의미함(NULL문자 - 문자열은 항상 널 문자를 포함하고 있음)
// 그래서 문자 배열 선언시 항상 하나 더 크게 선언함
// 문자 배열에서 명시되지 않은 원소는 0('\0')으로 초기화 됨
// %c <- *c는 단일 문자를 가리킬 때
// %s <- c는 문자'열'을 가리킬 때


//strlen() -> 문자열 길이 계산
 
// 문자열 대입 함수 -> strcpy(char *dest, *scr) -> 변환
// strncpy() -> 복사할 문자열의 길이를 지정하는 함수

// 문자열 접합 함수 -> strcat(char *dest, *scr) -> 널 문자 뒤로 미루고 갖다 붙이기
// strncat() -> 접합할 문자열의 길이를 지정하는 함수

// 사전 순으로 비교해주는 함수 strcmp(char *lhs, char *rhs) <:음수, ==:0, >:양수