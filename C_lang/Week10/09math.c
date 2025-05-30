#include <stdio.h>
#include <math.h>

int main()
{
    printf("   i   i제곱   i세제곱   제곱근(sqrt)\n");
    printf("-----------------------------------------\n");
    for (int i = 3; i < 7; i++)
        printf("%3d %7.1f %9.1f %9.1f\n", i, pow(i, 2), pow(i, 3), sqrt(i));
    printf("\n");

    printf("%5.2f, ", exp(1.0));
    printf("%5.2f, ", pow(3.14, 1.0));
    printf("%5.2f\n", sqrt(81));
    printf("%.2f, ", ceil(3.6));
    printf("%.2f, ", floor(5.8));
    printf("%.2f\n", fabs(-10.2));
}