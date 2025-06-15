#include <stdio.h>

#include <stdlib.h>
#include <time.h>

#define MAX 100

int guess; // declare global variable

int testNum(int input);
int main()
{
    int input;

    srand((long)time(NULL));
    guess = rand() % MAX + 1;

    printf("1에서 %d까지 사이에서 한 정수가 결정되었습니다.", MAX);
    printf("이 정수는 무엇일까요? 입력해 보세요 : ");

    while (scanf("%d", &input))
    {
        switch (testNum(input))
        {
        case 0:
            printf("정답입니다.");
            break;
        case 1:
            printf("입력한 수보다 작습니다. 다시 입력하새요 : ");
            break;
        case -1:
            printf("입력한 수보다 큽니다. 다시 입력하새요 : ");
            break;
        }
    }

    return 0;
}