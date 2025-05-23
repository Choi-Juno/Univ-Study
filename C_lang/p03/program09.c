#include <stdio.h>

int main()
{
  int num1, num2;
  int difference;

  printf("숫자1: ");
  scanf("%d", &num1);
  printf("숫자2: ");
  scanf("%d", &num2);

  difference = num1 - num2;
  printf("두 수의 차는 %d입니다.\n", difference);

  return 0;
}