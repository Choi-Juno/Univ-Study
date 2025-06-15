#include <stdio.h>

#define SIZE 6

int main()
{
  // 배열 score의 선언과 초기화
  double score[] = {89.3, 79.2, 84.83, 76.8, 92.52, 97.};
  double sum = 0;

  for (int i = 0; i < SIZE; i++)
  {
    sum += score[i];
    printf("score[%d] = %.2f\n", i, score[i]);
  }

  printf("성적의 합은 %.2f이고, 평균은 %.2f이다.\n", sum, sum / SIZE);

  return 0;
}