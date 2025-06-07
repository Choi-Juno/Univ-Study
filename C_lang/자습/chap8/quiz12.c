#include <stdio.h>

int main()
{
    int matrixA[4][3] = {
        {46, 79, 78},
        {35, 57, 28},
        {43, 68, 76},
        {56, 78, 98}};

    int matrixB[3][4] = {
        {78, 35, 99},
        {85, 82, 34},
        {58, 69, 29},
        {34, 59, 35},
    };

    int matrixC[3][4] = {0};

    printf("행렬 A와 B의 합을 구합니다.\n");
    printf("-----------------------------------\n");
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
        }
    }
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            printf("| %3d ", matrixC[i][j]);
        }
        printf("|\n");
    }
    printf("-----------------------------------\n");

    printf("행렬 A와 B의 차를 구합니다.\n");
    printf("-----------------------------------\n");
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
        }
    }
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            printf("| %3d ", matrixC[i][j]);
        }
        printf("|\n");
    }
    printf("-----------------------------------\n");

    return 0;
}