#include <stdio.h>

#define MAXSIZE 3

int stack[MAXSIZE];
int top = -1;

void push(int data);
void pop();
int isFull();

int main()
{
    push(3);
    push(5);
    pop();
    push(9);
    push(1);
    push(7);

    return 0;
}

void push(int data)
{
    if (isFull())
    {
        printf("모두 찬 스택입니다.\n");
        return;
    }

    stack[++top] = data;
    printf("스택 첨자 %d에 %d를 저장합니다.\n", top, data);
}

void pop()
{
    if (top == -1)
    {
        printf("밴 스택입니다.\n");
        return;
    }

    printf("스택 첨자 %d에서 %d를 제거합니다.\n", top, stack[top]);
    top--;
}

int isFull()
{
    if (top == MAXSIZE - 1)
        return 1;
    else
        return 0;
}
