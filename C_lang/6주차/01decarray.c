#include <stdio.h>

#define SIZE 5

int main()
{
  // 배열 선언
  int score[SIZE];

  // 배열 원소에 값 저장
  score[0] = 78;
  score[1] = 97;
  score[2] = 85;
  score[4] = 91;

  for (int i = 0; i < SIZE; i++)
  {
    printf("%d  ", score[i]);
  }
  printf("\n");

  return 0;
}