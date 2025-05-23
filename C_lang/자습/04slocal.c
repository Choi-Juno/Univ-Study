#include <stdio.h>

void reset(void);
void count(void);

int main()
{
    for (int i = 1; i <= 5; i++)
    {
        reset();
        count();
    }

    return 0;
}

void reset()
{
    auto int n = 1;
    printf("자동 지역변수 n: %2d\n", n);
    n++;
}

void count()
{
    // 초기값 10 저장, 첫번째 호출 때 10이 출력됙고, 함수 종료되어도 변수는 계속 유지됨.
    static int s = 10;
    printf("\t정적 지역변수 s: %2d\n", s);
    s++;
}