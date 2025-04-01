# 20251271 최준오
# 03-07

# 사용자로부터 두 개의 숫자 입력받기
num1 = float(input("첫 번째 숫자를 입력하시오: "))
num2 = float(input("두 번째 숫자를 입력하시오: "))

# 큰 수를 판별하여 출력
result = num1 if num1 > num2 else num2
print(f"두 숫자 중 큰 수는 {result}입니다.")

# 작은 수를 판별하여 출력
result = num1 if num1 < num2 else num2
print(f"두 숫자 중 작은 수는 {result}입니다.")
