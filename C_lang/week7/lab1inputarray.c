#include <stdio.h>

int main()
{
  int input[20] = {0};

  printf("배열에 저장할 정수를 여러 개 입력하시오. ");
  printf("0을 입력하면 입력을 종료합니다.\n");
  int i = 0;
  do
  {
    scanf("%d", &input[i]);
  } while (input[i++] != 0);

  i = 0;
  while (input[i] != 0)
  {
    printf("%d ", input[++i]);
  }
  puts("");

  return 0;
}