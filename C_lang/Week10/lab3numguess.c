#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MAX 100

int main()
{
    int guess, input;

    srand((long)time(NULL));

    guess = rand() % MAX + 1;

    printf("1에서 %d 사이에서 한 정수가 결정되었습니다.\n", MAX);
    printf("이 정수는 무엇일까요? 입력해 보세요. : ");

    while (scanf("%d", &input))
    {
        if (input > guess)
            printf("입력한 숫자 %d보다 작습니다. 다시 입력하세요 : ", input);
        else if (input < guess)
            printf("입력한 숫자 %d보다 큽니다. 다시 입력하세요 : ", input);
        else
        {
            printf("축하합니다. 정답입니다.\n");
            break;
        }
    }
}