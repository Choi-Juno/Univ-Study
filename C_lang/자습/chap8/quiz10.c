#include <stdio.h>

int main()
{
    int CProg[5][4] = {
        {97, 90, 88, 95},
        {76, 89, 75, 83},
        {60, 70, 88, 82},
        {83, 89, 92, 85},
        {75, 73, 72, 78},
    };

    int sum[5] = {0}; // Initialize sum array with zeros
    double avg[5];
    const char *names[] = {"이현수", "김기수", "김범용", "장기태", "이명수"};

    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            sum[i] += CProg[i][j];
        }
        avg[i] = (double)sum[i] / 4;
    }

    printf("\t이름\t중간\t중간\t기말\t기말\t총점\t평균\n");
    printf("=======================================================\n");

    for (int i = 0; i < 5; i++)
    {
        printf("\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
               names[i],
               CProg[i][0], CProg[i][1], CProg[i][2], CProg[i][3],
               sum[i], avg[i]);
    }

    printf("=======================================================\n");
    return 0;
}