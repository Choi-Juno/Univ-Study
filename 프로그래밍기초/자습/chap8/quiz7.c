#include <stdio.h>

int main()
{
    int arr[20];
    int count[10] = {0}; // 각 숫자의 빈도를 저장할 배열

    printf("0에서 9까지의 정수를 20개 입력하시오.\n");
    for (int i = 0; i < 20; i++)
    {
        scanf("%d", &arr[i]);
    }

    // 각 숫자의 빈도 계산
    for (int i = 0; i < 20; i++)
    {
        count[arr[i]]++;
    }

    // 가장 많이 나온 수와 그 빈도 찾기
    int maxFreq = 0; // 가장 큰 빈도
    int maxNum = 0;  // 가장 많이 나온 수

    for (int i = 0; i < 10; i++)
    {
        if (count[i] > maxFreq)
        {
            maxFreq = count[i];
            maxNum = i;
        }
    }

    printf("0 ~ 9 중 가장 많이 나온 수는 %d이고, %d번 나왔습니다.\n", maxNum, maxFreq);
}