# 20251271 최준오
# 3장 도전 프로그래밍 7번

import random

correctAnswer = random.randint(1, 10)


def guess_number(answer):
    if answer == correctAnswer:
        print(f"축하합니다 {answer}: 정답힙니다.")
        print("==========종료==========")
        return
    elif answer < correctAnswer:
        answer = int(input(f"{answer}보다 더 큰 수로 다시 입력 >>>"))
        guess_number(answer)
    else:
        answer = int(input(f"{answer}보다 더 작은 수로 다시 입력 >>>"))
        guess_number(answer)


answer = int(input("1부터 10 사이의 수를 맞추세요: "))
guess_number(answer)
