# 20251271 최준오
# 09-11

while True:
    user_input = int(input("1-10 사이 정수 입력(-1 입력 시 종료) >> "))

    if user_input == -1:
        print("프로그램을 종료합니다.")
        break
        # 반복문 종료

    if user_input < 1 or user_input > 10:
        print("1부터 1-까지의 숫자를 입력하시오.")
        continue  # 현재 반복 중단 후 다음 반복 시작

    if user_input % 2 == 0:
        print(f"{user_input}은 짝수입니다.")
    else:
        continue  # 홀수일 경우 현재 반복 중단 후 다음 반복 시작
