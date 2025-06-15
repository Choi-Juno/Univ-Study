#include <stdio.h>

union data
{
    char ch;
    int cnt;
    double real;
} data1;

int main()
{
    union data data2 = {'A'};
    union data data3 = {97.78}; // 컴파일 시 경고 발생
    union data data4 = data2;
    data4.real = 3.78;

    printf("%zu %zu\n", sizeof(union data), sizeof(data3));
    printf("%c %c %f\n", data2.ch, data3.ch, data4.real);

    data1.ch = 'a';
    printf("%c %d %f\n", data1.ch, data1.cnt, data1.real);

    data1.cnt = 100;
    printf("%c %d %f\n", data1.ch, data1.cnt, data1.real);

    data1.real = 3.156789;
    printf("%c %d %f\n", data1.ch, data1.cnt, data1.real);

    return 0;
}