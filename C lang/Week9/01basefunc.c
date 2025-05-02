#include <stdio.h>

void message();
void cacao();

int main()
{
    puts("메인 함수 시작입니다.");
    message();
    cacao();
    puts("메인 함수 종료입니다. ");

    return 0;
}

void message()
{
    puts("\t카카오 초콜릿을 좋아합니다.");
}
