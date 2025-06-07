#include <stdio.h>

int main()
{
    int matrix[4][4] = {
        {78, 48, 78, 98},
        {99, 92, 83, 29},
        {29, 64, 83, 89},
        {34, 78, 92, 56},
    };

    int sumMatrix[5][5] = {0};

    printf("다음 표의 세로와 가로합, 그리고 모든합을 구합니다.\n");
    printf("----------------------------------\n");
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            printf("| %3d ", matrix[i][j]);
        }
        printf("|\n");
    }
    printf("---------------------------------\n");

    printf("위 표의 세로와 가로합, 그리고 모든합을 각각 행과 열의 마지막에 구합니다.\n");

    printf("----------------------------------\n");
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            sumMatrix[i][j] = matrix[i][j];
            sumMatrix[i][4] += matrix[i][j];
            sumMatrix[4][j] += matrix[i][j];
            sumMatrix[4][4] += matrix[i][j];
        }
    }

    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            printf("| %3d ", sumMatrix[i][j]);
        }
        printf("|\n");
    }
    printf("---------------------------------\n");

    return 0;
}