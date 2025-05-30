lang = {"java": 1995, "C": 1972, "Python": 1990}

key = input("키(언어 이름) 입력 >> ")

if key in lang:
    print(f"결과 >> {key} : {lang.get(key)}")
else:
    print(f"결과 >> 존재하지 않는 언어입니다.")
