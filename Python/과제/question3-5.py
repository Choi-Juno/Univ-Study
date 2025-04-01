# 20251271 최준오
# 3장 도전 프로그래밍 5번

days = int(input("한 달 최대 일수를 입력 >> "))
start = int(input("첫 날 1일의 시작 요일을 입력(0=일, 1=월, ... 6=토) >> "))

print("\n월\t화\t수\t목\t금\t토\t일\n")

for i in range(start):
    print("\t", end="")

for i in range(1, days + 1):
    print(f"{i:2d}\t", end="")
    if (i + start) % 7 == 0:
        print()
