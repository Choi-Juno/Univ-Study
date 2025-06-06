#include <stdio.h>
#include <string.h>

int main()
{
    char dest[80] = "Java";
    char source[80] = "C is a language";

    printf("%s\n", strcpy(dest, source));
    printf("%s\n", strncpy(dest, "C#", 2));
    printf("%s\n\n", strncpy(dest, "C#", 3));

    char data[80] = "C";

    printf("%s\n", strcat(data, " is "));
    printf("%s\n", strncat(data, "a java", 2));
    printf("%s\n", strcat(data, "procedural"));
    printf("%s\n", strcat(data, "language"));

    return 0;
}