#include <stdio.h>
#include <string.h>

struct account
{
    char name[12];
    int account_number;
    double balance;
};

int main()
{
    struct account mine = {"John", 1001, 300000};
    struct account yours;

    strcpy(yours.name, "이동원");
    yours.account_number = 1002;
    yours.balance = 50000;

    printf("size of struct: %zu\n", sizeof(mine));
    printf("%s %d %.2f\n", mine.name, mine.account_number, mine.balance);
    printf("%s %d %.2f\n", yours.name, yours.account_number, yours.balance);

    return 0;
}