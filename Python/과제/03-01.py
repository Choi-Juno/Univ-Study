# 2025121 최준오
# 03-01


# 화씨를 섭씨로 변환하는 함수 정의
def c_to_fahrenheit(celcius):
    fahrenheit = (celcius * 9 / 5) + 32
    return fahrenheit


# 화씨를 섭씨로 변환하는 함수 정의
def f_to_celcius(fahrenheit):
    celcius = (fahrenheit - 32) * 5 / 9
    return celcius


# 사용자로부터 섭씨 온도 입력받기
celcius = float(input("섭씨 온도를 입력하시오: "))
# 함수 호출하여 섭씨를 화씨로 변환
fahrenheit = c_to_fahrenheit(celcius)
# 결과 출력
print(f"{celcius}도는 화씨로 {fahrenheit:.2f}도 입니다.")

# 사용자로부터 화씨 온도 입력받기
fahrenheit = float(input("화씨 온도를 입력하시오: "))
# 함수 호출하여 화씨를 섭씨로 변환
celcius = f_to_celcius(fahrenheit)
# 결과 출력
print(f"{fahrenheit}도는 섭씨로 {celcius:.2f}도 입니다.")
