#include <stdio.h>

int main()
{
    // declare register local variable
    register int sum = 0;

    // declare normal local variable that saves at stack
    int max;
    printf("양의 정수 입력 >> ");
    scanf("%d", &max);

    // declare register block local variable
    for (register int count = 1; count <= max; count++)
    {
        sum += count;
    }

    printf("합: %d\n", sum);

    return 0;
}