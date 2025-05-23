#include <stdio.h>

int isEqualArray(int a[], int b[], int n);

int main()
{
    int a[] = {4, 7, 9, 3, 6};
    int b[] = {10, 20, 30, 40, 50};

    int size = sizeof(a) / sizeof(a[0]);

    if (isEqualArray(a, b, size))
        printf("두 배열은 같다.\n");
    else
        printf("두 배열은 다르다.\n");
}

int isEqualArray(int a[], int b[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", b[i]);
    }
    printf("\n");

    for (int i = 0; i < n; i++)
    {
        if (a[i] != b[i])
            return 0;
    }
    return 1;
}