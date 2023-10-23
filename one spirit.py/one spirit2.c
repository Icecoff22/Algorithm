#include <stdio.h>

int main(){
	char m,first='Z',last='A';
	char tmpfirst,tmplast;//첫, 나중 알파벳 m과 비교계산하기 위한 변수
	int checkLower;//m 소문자여부 체크 변수
	int firstLower=0,lastLower=0;//첫, 나중 알파벳 소문자여부 체크 변수
	while(1){
		scanf("%c",&m);
		checkLower=0;
		if(m=='!')//종료조건
			break;
        if(m<65||m>122||(m>90&&m<97))//알파벳 아니면 다음 문자로
            continue;
		if(m>=97&&m<=122){//소문자일 경우 대문자로 바꾸기, 소문자여부 O 표시
			m-=32;
			checkLower=1;
		}
		if(firstLower){//기존의 가장 빠른 문자가 소문자일 경우 대문자화 하여 계산하기 위한 변수에 저장
			tmpfirst=first-32;
		}
		else{//소문자가 아니면 값 그대로 저장
			tmpfirst = first;
		}
		if(lastLower){//기존의 가장 나중 문자가 소문자일 경우 대문자화 하여 계산하기 위한 변수에 저장
			tmplast=last-32;
		}
		else{//소문자가 아니면 값 그대로 저장
			tmplast = last;
		}
		//아랫줄부터 비교계산
		if(m>=tmplast){//m이 나중문자보다 더 나중이면
			if(checkLower){//소문자 체크 후 맞으면 last변수에 소문자로 저장, 소문자 여부 O라고 표시
				last=m+32;
				lastLower=1;
			}
			else{//소문자 아니면 last변수에 m 그대로 저장, 소문자 여부 X라고 표시
				last=m;
				lastLower=0;
			}
		}
		if(m<=tmpfirst){//m이 처음문자보다 더 처음이면
			if(checkLower){//소문자 체크 후 맞으면 first변수에 소문자로 저장, 소문자 여부 O라고 표시
				first=m+32;
				firstLower=1;
			}
			else{//소문자 아니면 first변수에 m 그대로 저장, 소문자 여부 X라고 표시
				first=m;
				firstLower=0;
			}
		}
	}
	printf("%c\n%c",first,last);
	
}
