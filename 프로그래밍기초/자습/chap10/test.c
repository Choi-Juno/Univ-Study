#include <stdio.h>

int save(int money)
{
    static int amount = 100;
    return amount += money;
}

int main()
{
}