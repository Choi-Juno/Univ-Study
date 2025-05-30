# 20251271 최준오
# 3장 도전 프로그래밍 3번

degree = float(input("변환할 각도(degree) 값 입력 >> "))

radians = lambda degree: degree * (3.14 / 180)

print(f"{degree}도는 {radians(degree):.2f} 라디안입니다.")
