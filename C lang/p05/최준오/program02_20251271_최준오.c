#include <stdio.h>

int main()
{
  char operator;
  int a = 0, b = 0;
  int result;

  printf("첫 번째 정수를 입력하세요 >> ");
  scanf("%d", &a);

  printf("두 번째 정수를 입력하세요 >> ");
  scanf("%d", &b);

  printf("+, -, *, / 중에서 하나의 연산자를 입력하세요 >> ");
  scanf(" %c", &operator);

  if (operator== '+')
  {
    result = a + b;
  }
  else if (operator== '-')
  {
    result = a - b;
  }
  else if (operator== '*')
  {
    result = a * b;
  }
  else if (operator== '/')
  {
    result = a / b;
  }
  else
  {
    printf("연산자를 잘못 입력하셨습니다.\n");
    return 0;
  }

  printf("연산 결과: \n");
  printf("%d %c %d = %d\n", a, operator, b, result);

  return 0;
}