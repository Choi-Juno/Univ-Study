#include <stdio.h>

int main()
{
    int a[] = {4, 7, 9, 3, 6};
    int b[] = {10, 20, 30, 40, 50, 60};

    int aSize = sizeof(a) / sizeof(a[0]);
    int bSize = sizeof(b) / sizeof(b[0]);

    for (int i = 0; i < aSize; i++)
        b[i] = a[i];

    for (int i = 0; i < bSize; i++)
        printf("%d ", b[i]);
    printf("\n");

    return 0;
}