#include <stdio.h>

int nplus(int n)
{
    if (n == 1)
        return 1;
    else
        return (n + nplus(n - 1));
}
int main()
{
    printf("%d", nplus(10));

    return 0;
}