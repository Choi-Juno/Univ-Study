#include <stdio.h>

int main()
{
  unsigned long long int income;
  int tax;

  int pre_income = income % 10000;

  printf("소득 입력 >> ");
  scanf("%d", &income);

  if (pre_income <= 1200)
  {
    tax = 6;
  }
  else if (pre_income <= 4600)
  {
    tax = 15;
  }
  else if (pre_income <= 8800)
  {
    tax = 24;
  }
  else if (pre_income <= 15000)
  {
    tax = 35;
  }
  else if (pre_income <= 30000)
  {
    tax = 38;
  }
  else if (pre_income <= 50000)
  {
    tax = 40;
  }
  else if (pre_income > 50000)
  {
    tax = 42;
  }

  printf("현재 종합소득 : %llu, 세율: %d%%\n", income, tax);

  return 0;
}