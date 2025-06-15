#include <stdio.h>

int main()
{
    struct professor
    {
        char name[10];
        int number;
    };

    struct lecture
    {
        char name[20];
        int credit;
        int hour;
        struct professor prof;
    };

    struct lecture c = {"C 프로그래밍", 3, 4, {"전지현", 4578}};
}