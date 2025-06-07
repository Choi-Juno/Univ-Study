#include <stdio.h>

int main()
{
    int arr[5];

    printf("4개의 정수 입력 >> ");
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);

    arr[0] = a;
    arr[1] = b;
    arr[2] = c;
    arr[3] = d;

    arr[4] = (a + b + c + d);

    for (int i = 0; i < 5; i++)
        printf("%d ", arr[i]);
    printf("\n");
    return 0;
}