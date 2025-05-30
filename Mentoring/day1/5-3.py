sample_dict = {"Physics": 82, "Math": 65, "history": 75}

min_key = min(sample_dict, key=sample_dict.get)
min_value = sample_dict[min_key]

print(f"최솟값을 갖는 키 : {min_key}")
print(f"최솟값을 갖는 값 : {min_value}")
