#include <stdio.h>

int main()
{
    int total = 0;
    int pizza = 0;
    int hamburger = 0;
    int cola = 0;
    while (1)
    {
        printf("[메뉴]\n");
        printf("1. 피자 - 12000원\n");
        printf("2. 햄버거 - 8000원\n");
        printf("3. 콜라 - 2000원\n");
        printf("0. 주문 종료\n");
        printf("\n");
        printf("메뉴를 선택하세요 : ");

        int menu, count;
        scanf("%d", &menu);
        if (menu == 0)
        {
            break;
        }
        else if (menu == 1 || menu == 2 || menu == 3)
        {
            printf("수량을 입력하세요: ");
            scanf("%d", &count);

            if (menu == 1)
            {
                pizza += count;
                total = total + (pizza * 12000);
            }
            else if (menu == 2)
            {
                hamburger += count;
                total = total + (hamburger * 8000);
            }
            else if (menu == 3)
            {
                cola += count;
                total = total + (cola * 2000);
            }
            printf("\n");
        }
        else
        {
            printf("메뉴 번호를 잘못 입력하였습니다.\n\n");
            continue;
        }
    }

    printf("\n[주문 내역]\n");
    printf("피자 %d개 = %d원\n", pizza, pizza * 12000);
    printf("햄버거 %d개 = %d원\n", hamburger, hamburger * 8000);
    printf("콜라 %d개 = %d원\n", cola, cola * 2000);
    printf("총액: %d원\n", total);

    return 0;
}