#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LEN 100

typedef struct {
    char **items;//문자열 배열을 위한 투포인터
    int top;
} Stack;

void initialize(Stack *s) {
    s->top = -1;
    s->items = (char **)malloc(MAX_LEN * sizeof(char *));//포인터 배열 동적할당. 100개의 char*형이 들어갈 수 있도록.
}

/* push, pop은 기존 코드와 동일 */
void push(Stack *s, char *item) {
    if (s->top == MAX_LEN - 1) {
        printf("Stack Overflow\n");
        exit(EXIT_FAILURE);//프로그램 종료 코드.
    }
    s->items[++(s->top)] = item;
}

char* pop(Stack *s) {
    if (s->top == -1) {
        printf("Stack Underflow\n");
        exit(EXIT_FAILURE);
    }
    return s->items[(s->top)--];
}

/* 알고리즘은 이전에 말한 것과 동일. 구현의 문제 chatGPT로 해결 ㅎ */
/* 구현과정 : python으로 구현 후 c로 바꾸고 GPT가 해결 못한 설정들 살짝 수정 후 해결 */
int main() {
    char string[] = "ABC/-ADF/++";//이건 scanf로 바꿔서 입력받을 것.
    Stack stack;
    initialize(&stack);//stack 초기화. top설정과 문자열 받을 문자열 배열 동적할당.
    char * operand2;
    char * operand1;
    char tmp1[2] = {'(','\0'};
    char tmp2[2] = {')','\0'};
    for (int i = 0; i < strlen(string); i++) {
        if (string[i] >= 'A' && string[i] <= 'Z') { //알파벳일경우.
            char *item = (char *)malloc(2 * sizeof(char)); // char형과 '\0'을 붙여 문자열을 만듦.
            item[0] = string[i];
            item[1] = '\0';
            push(&stack, item); //문자열 push
        } else { //알파벳이 아닐경우
            operand2 = pop(&stack); // stack이므로 먼저 나오는 문자열이 뒤에 쓰일 문자열. ex) AB-면 stack에서는 B가 먼저 나오는데, 결과값이 A-B이니까 operand2로 설정.
            operand1 = pop(&stack); // 뒤에 나오는 문자열이므로 operand1로 설정.
            char *result = (char *)malloc((strlen(operand1) + strlen(operand2) + 3) * sizeof(char)); // 동적할당. operand1과 operand2의 길이 + '(', ')', '\0' 포함해야 하므로 3 추가.
            char op[2];
            op[0] = string[i];
            op[1] = '\0';
            //sprintf는 문자열 포맷팅(형식화)하여 넣을 문자열 지정 가능. 
            //여기서는 '(OP1+OP2)'와 같은 형식을 위해 포맷팅을 해주고, result 변수로 저장.
            //sprintf(result, "(%s%c%s)", operand1, string[i], operand2); 
            strcpy(result, tmp1);
            strcat(result, operand1);
            strcat(result,op);
            strcat(result, operand2);
            strcat(result, tmp2);
            result[strlen(result)]='\0';
            printf("%s\n",result);
            push(&stack, result);
        }
    }

    // 가장 마지막에 push된 것이 곧 결과이므로, pop을 하여 결과 출력.
    char *finalResult = stack.items[0];
    printf("%s\n", finalResult);

    // 메모리 누수 방지를 위한 free. gpt설정이므로 다시 봐야할듯.
    for (int i = 0; i <= stack.top; i++) {
        free(stack.items[i]);
    }
    free(stack.items);

    return 0;
}
