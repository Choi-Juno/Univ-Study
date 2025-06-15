#include <stdio.h>

int main()
{
  int input;
  do
  {
    printf("[0]종료 [1]아메리카노 [2]카페라떼 [3]카푸치노\n");
    printf("주문할 커피 또는 종료(0)을 입력 >> ");
    scanf("%d", &input);
  } while (input != 0);

  return 0;
}