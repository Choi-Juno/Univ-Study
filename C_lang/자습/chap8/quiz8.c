#include <stdio.h>

int main()
{
    int year, month;

    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    printf("년과 월을 다음과 같이 입력하면 그 달의 말일을 알려드립니다.\n");
    printf("2024 2 : 입력 >> ");
    scanf("%d %d", &year, &month);

    if (month == 2)
    {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            days[1] = 29;
    }

    printf("%d년 %d월의 말일은 %d일입니다.\n", year, month, days[month - 1]);

    return 0;
}