#include <stdio.h>
#include <string.h>

int main()
{
    char src[20] = "C Python";
    char dst[20];

    printf("%s\n", src);
    printf("%zu\n", strlen(src));
    memcpy(dst, src, strlen(src) + 1);
    printf("%s\n", dst);
    memcpy(dst, "안녕하세요!", strlen("안녕하세요") + 1);
    printf("%s\n\n", dst);

    char *s1 = "C lang";
    char *s2 = "C lang";

    printf("strcmp(%s, %s) = %d\n", s1, s2, strcmp(s1, s2));
    s1 = "C lang";
    s2 = "C ";
    printf("strcmp(%s, %s) = %d\n", s1, s2, strcmp(s1, s2));
    printf("strcmp(%s, %s) = %d\n", s2, s1, strcmp(s2, s1));
    printf("strncmp(%s, %s, %d) = %d\n", s1, s2, 2, strncmp(s1, s2, 2));

    return 0;
}