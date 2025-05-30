#include <stdio.h>

int main()
{
  short sVar = 32600;
  int iVar = -2140000000;

  printf("저장 값 : %d, %d\n", sVar, iVar);

  // C99이후 추가된 자료형 64비트의 정수형ㅈ 지원
  long long dist1 = 2720000000;
  __int64_t dist2 = 4500000000;

  printf("지구와 천왕성 사이의 거리 : %lld\n", dist1);
  printf("지구와 해왕성 사이의 거리 : %lld\n", dist2);

  return 0;
}