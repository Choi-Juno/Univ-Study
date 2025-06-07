#include <stdio.h>

int main()
{
    int a[] = {32, 56, 7, 8, 24};
    int b[] = {3, 21, 35, 57, 24, 82, 8};

    int aSize = sizeof(a) / sizeof(a[0]);
    int bSize = sizeof(b) / sizeof(b[0]);

    int c[aSize + bSize];
    for (int i = 0; i < aSize; i++)
        c[i] = a[i];
    for (int i = 0; i < bSize; i++)
        c[aSize + i] = b[i];

    for (int i = 0; i < aSize + bSize; i++)
        printf("%d ", c[i]);
    printf("\n");

    return 0;
}