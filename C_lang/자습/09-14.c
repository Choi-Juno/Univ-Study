#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int duplicate(int num, int lotto[], int cnt);

int main()
{
    int lotto[6];
    int cnt = 0;
    int num = 0;

    srand(time(NULL));

    printf("로또 당첨 번호: ");

    while (cnt < 6)
    {
        num = rand() % 45 + 1;
        if (!duplicate(num, lotto, cnt))
        {
            lotto[cnt] = num;
            cnt++;
        }
    }

    for (int i = 0; i < 6; i++)
    {
        printf("%d ", lotto[i]);
    }
    printf("\n");

    return 0;
}

int duplicate(int num, int lotto[], int cnt)
{
    for (int i = 0; i < cnt; i++)
    {
        if (lotto[i] == num)
            return 1;
    }
    return 0;
}
