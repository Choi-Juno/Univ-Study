#include <stdio.h>

int main()
{
    int score[5];
    int total = 0;
    double average = 0;
    int max = 0;

    printf("5명의 국어 점수를 입력하세요: \n");
    for (int i = 0; i < 5; i++)
    {
        scanf("%d", &score[i]);
    }

    for (int i = 0; i < 5; i++)
    {
        total += score[i];
        if (score[i] > max)
        {
            max = score[i];
        }
    }

    average = (double)total / 5;

    printf("\n[결과]\n]");
    printf("전체 평균: %.1f점\n", average);
    printf("최고 점수: %d점\n", max);
}