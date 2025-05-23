#include <stdio.h>

int main()
{
  int E = 0, I = 0;
  int S = 0, N = 0;
  int T = 0, F = 0;
  int J = 0, P = 0;

  char answer;

  // Question 1
  printf("1. 수업 시간에 배운 내용이 이해가 안될 때 나는?\n");
  printf(" a. 친구 또는 교수님에게 도움을 요청한다\n");
  printf(" b. 먼저 혼자 고민해본다\n");
  printf(">> ");
  scanf(" %c", &answer);

  if (answer == 'a' || answer == 'A')
  {
    E++;
  }
  else if (answer == 'b' || answer == 'B')
  {
    I++;
  }
  else
  {
    printf("잘못 입력하셨습니다.\n");
    return 0;
  }

  // Question 2
  printf("2. 백찬은 교수님이 코드 예제를 설명해줄 때 나는?\n");
  printf(" a. 지금 눈앞의 예제가 어떻게 돌아가는지 집중한다\n");
  printf(" b. 이 코드가 왜 필요한지, 어떤 상황에서 쓰일지 필요한다.\n");
  printf(">> ");
  scanf(" %c", &answer);

  if (answer == 'a' || answer == 'A')
  {
    S++;
  }
  else if (answer == 'b' || answer == 'B')
  {
    N++;
  }
  else
  {
    printf("잘못 입력하셨습니다.\n");
    return 0;
  }

  // Question 3
  printf("3. 시험 문제 풀 때 나는?\n");
  printf(" a. 정답 근거가 논리적으로 맞는지 판단한다\n");
  printf(" b. 어떤 답이 더 자연스럽고 공감 가는지 느낌으로 고른다\n");
  printf(">> ");
  scanf(" %c", &answer);

  if (answer == 'a' || answer == 'A')
  {
    T++;
  }
  else if (answer == 'b' || answer == 'B')
  {
    F++;
  }
  else
  {
    printf("잘못 입력하셨습니다.\n");
    return 0;
  }

  // Question 4
  printf("4. 과제 마감 전날 나는?\n");
  printf(" a. 계획대로 미리 다 해둔다.\n");
  printf(" b. 마감 직전 급하게 완성한다.\n");
  printf(">> ");
  scanf(" %c", &answer);

  if (answer == 'a' || answer == 'A')
  {
    J++;
  }
  else if (answer == 'b' || answer == 'B')
  {
    P++;
  }
  else
  {
    printf("잘못 입력하셨습니다.\n");
    return 0;
  }

  printf("당신의 MBTI 결과는: %c%c%c%c\n", E > I ? 'E' : 'I', S > N ? 'S' : 'N', T > F ? 'T' : 'F', J > P ? 'J' : 'P');

  return 0;
}