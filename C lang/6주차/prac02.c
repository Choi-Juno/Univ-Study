#include <stdio.h>

int main()
{
  int sum = 0;
  int prev_sum = 0;
  int i = 0;
  printf("1부터 n까지의 합 중에서 10000을 넘지 않는 가장 큰 합은? \n");

  for (i = 1; i <= 10000; i++)
  {
    prev_sum = sum; // 현재 합을 이전 합으로 저장
    sum += i;

    if (sum > 10000)
    {
      sum = prev_sum; // 10000을 초과하기 직전의 합으로 되돌림
      i--;            // 마지막으로 더한 수를 취소
      break;
    }
  }

  printf("1부터 %d까지의 합이 %d입니다.\n", i, sum);
  return 0;
}
