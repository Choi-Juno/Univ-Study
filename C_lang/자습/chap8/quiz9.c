#include <stdio.h>

int main()
{
    double data[10];

    for (int i = 0; i < 10; i++)
    {
        data[i] = (1.0 / ((i + 2) * (i + 3)));
    }

    for (int i = 0; i < 10; i++)
    {
        printf("data[%d] = %.3f\n", i, data[i]);
    }

    return 0;
}