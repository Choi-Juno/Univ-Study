# LList
a = [10, 20, 30]
# print(a)
# print(type(a))

# Tuple
tpl = (10, 20, 30)
tpl
type(tpl)

# 내장 함수  id()
a = b = 1
# print(a)
# print(b)
# print(id(a))
# print(id(b))

# list : mutuable
a = [1, 2, 3]
a
id(a)
a.append(4)
a
id(a)

# 표준 입력 함수 input()
age = 19
age

age = input()
int(age)

age = input("나이를 입력하세요: ")
age
int(age) + 5

a, b = 5, 8
print("{} + {} = {}".format(a, b, a + b))
print("{0} + {1} = {2}".format(a, b, a + b))
print("{pres} / {post} = {result}.B ".format(ptr=s, post=b, result=a / b))

# f-string
width, height = 3, 6
f"가로: {width}, 세로: {height}, 삼각형 면적: {width * height / 2}"

# $ string
# deprecated
name = "영철"
"안녕 영철!"
"안녕, %s" % name

won, ex_rate = 150000, 1449.85
"{:10d}원은 {:15.2f}$".format(won, won / ex_rate)

# import 문장
import math

dir(math)
math.pi
math.e
math.pow(3, 2)
