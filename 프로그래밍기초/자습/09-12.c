#include <stdio.h>

void copyArray(int from[], int to[], int n);

int main()
{
    int a[] = {4, 7, 9, 3, 6};
    int b[] = {10, 20, 30, 40, 50, 60};

    int sizeA = sizeof(a) / sizeof(a[0]);
    int sizeB = sizeof(b) / sizeof(b[0]);

    printf("a[] = ");
    for (int i = 0; i < sizeA; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\n");

    printf("b[] = ");
    for (int i = 0; i < sizeB; i++)
    {
        printf("%d ", b[i]);
    }
    printf("\n");

    copyArray(a, b, sizeA);
    printf("배열 복사 후\n");
    printf("b[] = ");
    for (int i = 0; i < sizeB; i++)
    {
        printf("%d ", b[i]);
    }
    printf("\n");
}

void copyArray(int from[], int to[], int n)
{
    for (int i = 0; i < n; i++)
    {
        to[i] = from[i];
    }
}