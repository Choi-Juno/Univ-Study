#include <stdio.h>

int main()
{
    double degree[] = {-5.34, 3.67, 19.76, 28.76, 35.63};
    int arrSize = sizeof(degree) / sizeof(degree[0]);

    printf("배열 원소 값을 출력\n");
    for (int i = 0; i < arrSize; i++)
    {
        printf("%.2f ", degree[i]);
    }
    printf("\n");

    return 0;
}