#include <stdio.h>
#define MAX 9

int main()
{
  for (int i = 2; i <= MAX; i++)
  {
    printf("%5d단 출력\n", i);
    for (int j = 2; j <= MAX; j++)
      printf("%d * %d = %2d ", i, j, i * j);
    printf("\n");
  }

  return 0;
}