#include <stdio.h>

int main()
{
  int i, sum, max;
  printf("양의 정수 입력 >> ");
  scanf("%d", &max);

  for (i = 1, sum = 0; i <= max; i++)
    sum += i;

  printf("\nfor 문으로 구한 1에서 %d까지의 합: %3d\n", max, sum);

  i = 1;
  sum = 0;
  while (i <= max)
  {
    sum += i;
    i++;
  }

  printf("\nwhile 문으로 구한 1에서 %d까지의 합: %3d\n", max, sum);

  return 0;
}