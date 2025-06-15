#include <stdio.h>

int main()
{
    int score[10];
    int pass = 0;
    int fail = 0;

    printf("10명의 점수를 입력하세요: \n");
    for (int i = 0; i < 10; i++)
    {
        scanf("%d", &score[i]);
    }

    for (int i = 0; i < 10; i++)
    {
        if (score[i] >= 60)
            pass++;
        else
            fail++;
    }

    printf("\n[결과]\n");
    printf("합격자 수: %d명\n", pass);
    printf("불합격자 수: %d명\n", fail);
}