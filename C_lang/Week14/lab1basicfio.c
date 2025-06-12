#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *f;

    if ((f = fopen("myinfo.txt", "w")) == NULL)
    {
        printf("파일이 열리지 않습니다.\n");
        exit(1);
    }

    char tel[15] = "010-1234-5678";
    char add[30] = "서초구 대정로 557";
    int age = 22;

    fprintf(f, "전화번호 %s, 주소: %s, 나이: %d\n", tel, add, age);

    fclose(f);

    printf("전화번호: %s, 주소: %s, 나이: %d\n", tel, add, age);
    puts("프로젝트 폴더에서 파일 myinfo.txt를 확인하세요.");

    return 0;
}