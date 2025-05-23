#include <stdio.h>

void process();

int main()
{
    process();
    process();
    process();

    return 0;
}

void process()
{
    static int sx;
    int x = 1;
    printf("%d %d\n", x, sx);

    x += 3;
    sx += x + 3;
}
