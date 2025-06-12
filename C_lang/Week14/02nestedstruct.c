#include <stdio.h>
#include <string.h>

struct date
{
    int year;
    int month;
    int day;
};

struct account
{
    struct date open;
    char name[12];
    int account_number;
    double balance;
};

int main()
{
    struct account me = {{2022, 3, 9}, "gildong", 1001, 300000};

    printf("size of struct: %zu\n", sizeof(me));
    printf("[%d. %d. %d]\n", me.open.year, me.open.month, me.open.day);
    printf("%s %d %.2f\n", me.name, me.account_number, me.balance);

    return 0;
}