#include <stdio.h>

#define MAX 4

int main()
{
  int num = 0;
  double height = 0;
  while (num < MAX)
  {
    printf("키 입력 >> ");
    scanf("%lf", &height);
    if (height <= 130)
      num++;
  }

  printf("정원 %d명 완료!\n", num);

  return 0;
}