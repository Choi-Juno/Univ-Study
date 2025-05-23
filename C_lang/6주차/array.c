#include <stdio.h>
#include <stdlib.h>

int main()
{
  int str = 0;
  printf("문자열을 입력하세요. >> ");
  scanf("%s", &str);

  int *arr = (int *)malloc(strlen(str) * sizeof(int));

  for (int i = 0; i < strlen(str); i++)
  {
    printf("%c ", arr[i]);
  }

  free(arr);

  return 0;
}