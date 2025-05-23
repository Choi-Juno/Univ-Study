#include <stdio.h>

int main()
{
  char c1 = 'a';
  char c2 = 65;
  char c3 = '\127';
  char c4 = '\x57';

  printf("문자 값(문자): %c, %c, %c, %c\n", c1, c2, c3, c4);
  printf("코드 값(번호): %d, %d, %d, %d\n", c1, c2, c3, c4);

  return 0;
}