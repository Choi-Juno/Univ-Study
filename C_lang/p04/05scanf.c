#include <stdio.h>

int main()
{
  int month = 0;
  printf("1년은 몇달: ");
  scanf("%d", &month);

  if (month == 12)
  {
    printf("정답!");
  }
  else
  {
    printf("오답!");
  }
}