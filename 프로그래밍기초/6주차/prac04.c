#include <stdio.h>

int main()
{
  for (int i = 0; i < 8; i++)
  {
    // 공백 출력
    for (int space = 0; space < 8 - i; space++)
    {
      printf(" ");
    }

    // 앞쪽 숫자 출력
    for (int j = i; j >= 0; j--)
    {
      printf("%d", j);
    }

    // 뒤쪽 숫자 출력
    for (int j = 1; j <= i; j++)
    {
      printf("%d", j);
    }
    printf("\n");
  }
  return 0;
}