# 20251271 최준오
# 3장 도전프로그래밍 1번

num = int(input("피보나치 수열을 어디까지 출력할까요? "))
fibo_list = []

a, b = 0, 1

while a < num:
    fibo_list.append(a)
    a, b = b, a + b

print(fibo_list)
