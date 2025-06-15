#include <stdio.h>

int sum(int n)
{
    static int number_of_calls = 0;

    if (n == 0)
        return 0;
    else
    {
        number_of_calls++;
        printf("%d번 호출\n", number_of_calls);
        return n + sum(n - 1);
    }
}

int main()
{
    int n;
    printf("양의 정수를 입력 >> ");
    scanf("%d", &n);

    printf("sum = %d\n", sum(n));

    return 0;
}