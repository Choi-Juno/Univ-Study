#include <stdio.h>
#include <string.h>

int main()
{
    char str[] = "C and C++\t languages are best!";
    // 구분자: 공백, !, \t
    char *delimiter = " !\t";

    printf("문자열 \"%s\"을 >> \n", str);
    printf("구분자[%s]를 이용하여 토큰을 추출 >> \n", delimiter);
    char *ptoken = strtok(str, delimiter);
    while (ptoken)
    {
        printf("%s\n", ptoken);
        ptoken = strtok(NULL, delimiter);
    }

    return 0;
}