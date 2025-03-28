#include <stdio.h>

int main()
{
  int age, price;

  printf("\"영화 요금 안내\" 프로그램\n");

  printf("나이를 입력하세요 >> ");
  scanf("%d", &age);

  if (age >= 0 && age <= 3)
  {
    price = 0;
  }
  else if (age >= 4 && age <= 12)
  {
    price = 5000;
  }
  else if (age >= 13 && age <= 18)
  {
    price = 10000;
  }
  else if (age >= 19)
  {
    price = 10000;
  }
  else
  {
    printf("나이를 잘못 입력하셨습니다.\n");
    return 0;
  }

  printf("당신의 나이는 %d살입니다.\n", age);
  printf("영화표의 가격은 %d원입니다.\n", price);

  return 0;
}