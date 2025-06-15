#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int judge(int user, int computer)
{
    switch (user)
    {
    case 0:
        if (computer == 0)
            return 0;
        else if (computer == 1)
            return -1;
        else
            return 1;
    case 1:
        if (computer == 0)
            return 1;
        else if (computer == 1)
            return 0;
        else
            return -1;
    case 2:
        if (computer == 0)
            return -1;
        else if (computer == 1)
            return 1;
        else
            return 0;
    }
}

int main()
{
    srand(time(NULL));
    int computer = rand() % 3;
    int user;
    printf("가위(0) 바위(1) 보(2) 중 하나 입력 >> ");
    scanf("%d", &user);

    int result = judge(user, computer);
    char *hand[3] = {"가위", "바위", "보"};

    printf("당신은 %s이고, 컴퓨터는 %s입니다.\n", hand[user], hand[computer]);

    if (result == 0)
        printf("비겼습니다.");
    else if (result == 1)
        printf("당신이 이겼습니다.");
    else
        printf("컴퓨터가 이겼습니다.");

    return 0;
}