#include <stdio.h>

int main()
{
  printf("|%-2d|%-2d|%-3d|\n", 1, 2, 3);
  int m, n;
  for (m = 1; m <= 10; m++)
  {
    printf("m = %-2d\n", m);
    for (n = 1; n <= 7; n++)
      printf("n = %-3d", n);
    puts("");
  }

  return 0;
}