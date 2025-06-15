#include <stdio.h>

int main()
{
  int input;
  do
  {
    /* code */
    printf("양의 정수 또는 음수나 0[종료] 입력 후 [Enter] >> ");
    scanf("%d", &input);
    if (input <= 0)
      break;
    printf("정수 %d: 8진수 %#o, 16진수 %#x\n", input, input, input);
  } while (1);

  return 0;
}