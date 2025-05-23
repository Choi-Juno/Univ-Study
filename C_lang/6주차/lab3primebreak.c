#include <stdio.h>

int main()
{
  int num, j;
  printf("2 이상 양의 정수 입력 >> ");
  scanf("%d", &num);

  for (j = 2; j < num; j++)
  {
    if (num % j == 0)
    {
      break;
    }
  }
  if (j == num)
    printf("%d는 소수입니다.\n", num);
  else
    printf("%d는 소수가 아닙니다.\n", num);

  return 0;
}