#include <stdio.h>

void decToHex(int n);

int main()
{
    int n;

    printf("10진수를 입력하면 16진수를 출력합니다.");
    printf("정수 입력 >>> ");
    scanf("%d", &n);

    decToHex(n);
    printf("\n");
}

void decToHex(int n)
{
    if (n == 0)
        return;
    decToHex(n / 16); // 상위 자리수 먼저 출력

    int reminder = n % 16;
    if (reminder < 10)
        printf("%d", reminder); // 0 ~ 9
    else
        printf("%c", reminder - 10 + 'A'); // 10 ~ 15
}