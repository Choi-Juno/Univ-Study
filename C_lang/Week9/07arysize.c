#include <stdio.h>

int main()
{
    int data[] = {3, 4, 5, 7, 9};

    printf("%d %d\n", (int)sizeof(data), (int)sizeof(data[0]));
    printf("배열 data의 크기 == %d\n", (int)(sizeof(data) / sizeof(data[0])));

    // 4 by 3 2D array
    double x[][2] = {
        {1.2, 2.3},
        {7.3, 8.0}};

    printf("%d %d ", (int)sizeof(x), (int)sizeof(x[0]));
    printf("%d %d\n", (int)sizeof(x[1]), (int)sizeof(x[0][0]));

    int rowsize = sizeof(x) / sizeof(x[0]);
    int colsize = sizeof(x[0]) / sizeof(x[0][0]);
    printf("2차원 배열 x: 행 수 = %d 열 수 = %d\n", rowsize, colsize);
    printf("2차원 배열 x: 전체 원소 수 = %d\n", (int)(sizeof(x) / sizeof(x[0][0])));

    return 0;
}