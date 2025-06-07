#include <stdio.h>

int main()
{
    double arr[] = {98.56, 78.62, 78.69, 89.32, 95.29};
    int size = sizeof(arr) / sizeof(arr[0]);

    for (int i = 0; i < size; i++)
        printf("%.2f ", arr[i]);
    printf("\n");

    double sum = 0;
    double avg = 0;

    for (int i = 0; i < size; i++)
        sum += arr[i];
    avg = sum / size;

    printf("배열의 합은 %.3f, 평균은 %.3f 입니다.\n", sum, avg);

    return 0;
}