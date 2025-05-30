# 20251271 최준오
# 03-09

# 빈 목록 생성
name_list = []

# 사용자로부터 이름 입력받기
num_names = int(input("입력할 이름의 수를 입력하시오: "))

for i in range(num_names):
    name = input(f"{i+1}. 이름을 입력하시오: ")
    name_list.append(name)

# 얼퍼뱃 순으로 정렬
name_list.sort()  # 리스트의 정렬

# 정렬된 이름 목록 출력
print("\n입력한 이름들(문자순: ")
for name in name_list:
    print(f"{name}")
