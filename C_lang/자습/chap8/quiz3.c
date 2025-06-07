#include <stdio.h>

int main()
{
    int data[] = {3, 21, 35, 57, 24, 82, 8};
    int arrSize = sizeof(data) / sizeof(data[0]);

    printf("배열 원소 값을 출력\n");
    for (int i = 0; i < arrSize; i++)
    {
        printf("%d", data[i] + 10);
        if (i < arrSize - 1)
            printf(", ");
    }
    printf("\n");

    return 0;
}