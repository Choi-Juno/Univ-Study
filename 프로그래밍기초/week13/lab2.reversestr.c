#include <stdio.h>
#include <string.h>

void reverse(char[]);

int main()
{
    char s[50];
    char *str = "Python C";
    memcpy(s, str, strlen(str) + 1);
    printf("%s\n", s);

    reverse(s);
    printf("%s\n", s);

    return 0;
}

void reverse(char str[])
{
    for (int i = 0, j = (int)strlen(str) - 1; i < j; i++, j--)
    {
        char c = str[i];
        str[i] = str[j];
        str[j] = c;
    }
}