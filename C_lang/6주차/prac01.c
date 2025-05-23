#include <stdio.h>

#define NUM 100

int main()
{
  int count = 0; // 한 줄에 출력된 숫자의 개수를 세는 변수

  for (int i = 1; i <= NUM; i++)
  {
    if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
      continue;
    printf("%2d ", i);
    count++;

    if (count % 10 == 0) // 10개가 출력될 때마다 줄바꿈
      printf("\n");
  }

  printf("\n");
  return 0;
}