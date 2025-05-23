#include <stdio.h>

int main()
{
  for (int i = 1; i <= 5; i++)
  {
    // 공백 출력
    for (int space = 0; space < 5 - i; space++)
    {
      printf(" ");
    }

    // 숫자 출력
    for (int j = i; j >= 1; j--)
    {
      printf("%d", j);
    }

    printf("\n");
  }

  return 0;
}