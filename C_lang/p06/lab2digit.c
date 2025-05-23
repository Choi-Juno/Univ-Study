#include <stdio.h>

int main()
{
  int input = 0, result = 0, digit = 0;
  int divider = 100;

  printf("양의 정수[100~999] 입력 : ");
  scanf("%d", &input);
  result = input;

  do
  {
    digit = result / divider;
    result %= divider;
    printf("%3d 단위 출력 : %d\n", divider, digit);
    divider /= 10;
  } while (divider >= 1);

  return 0;
}