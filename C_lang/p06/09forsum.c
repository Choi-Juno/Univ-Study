#include <stdio.h>

int main()
{
  int i, sum;
  for (i = 1, sum = 0; i <= 10; i++)
    sum += i;

  printf("1 ~ 10 합: %d\n", sum);

  for (i = 0, sum = 0; i <= 10;)
  {
    sum += ++i;
  }
  printf("1 ~ 10 합: %d\n", sum);

  for (i = 1, sum = 0; i <= 10; sum += i, i++)
    ;
  printf("1 ~ 10 합: %d\n", sum);

  for (i = 0, sum = 0; i <= 9; sum += ++i)
    ;
  printf("1 ~ 10 합: %d\n", sum);

  return 0;
}