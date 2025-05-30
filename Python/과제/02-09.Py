# 20251271 최준오
# 02-09

# 변수에 가로와 세로 길이 저장
width, height = 3, 6
# str.format()
print("가로: {}, 세로: {}, 사각형 면적: {}".format(width, height, width * height))

# 정수로 인자 지정
print("가로: {0}, 세로: {1}, 사각형 면적: {2}".format(width, height, width * height))
# 키워드 area로 면적 인자 지정
print(
    "가로: {0}, 세로: {1}, 사각형 면적: {area}".format(
        width, height, area=width * height
    )
)

# format string
pi, radius = 3.14, 5.78
print(f"반지름: {radius}, 원면적: {radius*radius*pi}")
print(f"반지금: {radius}, 원둘레: {2*radius*pi}")
