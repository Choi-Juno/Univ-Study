#include <stdio.h>

int main()
{
  float x = 3.14f;
  double y = -3.141582;
  long double z = 29.74;

  printf("부동소수 값: %f, %f, %Lf\n", x, y, z);
  return 0;
}