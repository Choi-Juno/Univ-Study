#include <stdio.h>

int main()
{
    int dan;
    while (1)
    {
        printf("출력할 구구단의 단을 입력하세요(2~9, 0=종료) : ");
        scanf("%d", &dan);
        if (dan == 0)
        {
            printf("프로그램을 종료합니다.\n");
            break;
        }
        if (dan < 2 || dan > 9)
        {
            printf("2~9 사이의 숫자만 입력해야 합니다.\n\n");
            continue;
        }
        else
        {
            printf("\n\"%d단 출력\"\n", dan);
            for (int i = 0; i < 9; i++)
            {
                printf("%d * %d = %d\n", dan, i + 1, dan * (i + 1));
            }
            printf("\n");
        }
    }

    return 0;
}