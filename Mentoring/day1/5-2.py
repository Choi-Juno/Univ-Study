sample_dict = {"a": 100, "b": 200, "c": 300}

value = int(input("확인할 값을 입력하세요: "))
if value in sample_dict.values():
    print(f"{value} (은)는 딕셔너리에 포함되어 있습니다.")
else:
    print(f"{value} (은)는 딕셔너리에 포함되어 있지 않습니다.")
