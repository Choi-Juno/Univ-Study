#include <stdio.h>
#include <stdlib.h>

int main()
{
    char ch;

    printf("문자를 계속 입력하고 Enter 누르면 >>\n");
    while ((ch = getchar()) != 'q')
        putchar(ch);

    printf("\n문자를 누른 것이 보이고, _putch에 의해 입력문자 출력 >> \n");
    while ((ch = _getche()) != 'q')
        _putch(ch);

    return 0;
}