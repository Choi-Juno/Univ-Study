#include <stdio.h>

#define PI 3.141592

int main(int argc, char const *argv[])
{
  float radius = 5.37f;

  float area = radius * radius * PI;
  float round = 2 * radius * PI;

  printf("원 반지름: %.3f\n", radius);
  printf("원 면적: %.3f\n", area);
  printf("원 넓이: %.3f\n", round);

  return 0;
}
