#include <stdio.h>

#define ROWSIZE 2
#define COLSIZE 3

int main()
{
  int td[ROWSIZE][COLSIZE];

  td[0][0] = 1;
  td[0][1] = 2;
  td[0][2] = 3;
  td[1][0] = 4;
  td[1][1] = 5;
  td[1][2] = 6;

  printf("반복문 for을 이용하여 출력\n");
  for (int i = 0; i < ROWSIZE; i++)
  {
    for (int j = 0; j < COLSIZE; j++)
      printf("td[%d][%d] = %d ", i, j, td[i][j]);
    printf("\n");
  }

  return 0;
}