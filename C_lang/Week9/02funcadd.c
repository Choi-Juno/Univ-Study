#include <stdio.h>

int add(int a, int b);

int main()
{
    int a = 3, b = 5;

    int sum = add(a, b);
    printf("합: %d\n", sum);

    return 0;
}

int add(int a, int b)
{
    return a + b;
}

int findMin(int x, int y)
{
    int min = x < y ? x : y;

    return min;
}