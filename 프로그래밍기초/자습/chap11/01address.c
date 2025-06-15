#include <stdio.h>

int main()
{
    int input;

    printf("정수 입력: ");
    scanf("%d", &input);
    printf("입력 값: %d\n", input);
    printf("주소 값: %p(16진수)\n", &input);
    printf("주소값: %llu(10진수)\n", (uintptr_t)&input);

    printf("주소값 크기: %zu\n", sizeof(&input));

    return 0;
}