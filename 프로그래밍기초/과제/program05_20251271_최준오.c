#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void rollDice(int roll, int dice[]);

int main()
{
    srand(time(NULL));
    int dice[6] = {0};

    int roll = 0;

    while (1)
    {
        printf("주사위를 몇 번 굴리겟습니까? (0이하의 수 입력 시 종료): ");
        scanf("%d", &roll);

        if (roll > 0)
        {
            rollDice(roll, dice);
            printf("1이 나온 횟수: %d\n", dice[0]);
            printf("2가 나온 횟수: %d\n", dice[1]);
            printf("3이 나온 횟수: %d\n", dice[2]);
            printf("4가 나온 횟수: %d\n", dice[3]);
            printf("5가 나온 횟수: %d\n", dice[4]);
            printf("6이 나온 횟수: %d\n", dice[5]);

            printf("\n");
            for (int i = 0; i < 6; i++)
                dice[i] = 0;
        }
        else if (roll <= 0)
        {
            printf("프로그램을 종료합니다.\n");
            return 0;
        }
    }
}
void rollDice(int roll, int dice[])
{
    for (int i = 0; i < roll; i++)
    {
        int random = rand() % 6 + 1;
        dice[random - 1]++;
    }
}