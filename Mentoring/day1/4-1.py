time = input("시각 정보(16:30:15) 입력 >> ")

hour, mins, secs = time.split(":")

print("시각 입력 정보: ", time)
print(f"{hour}시 {mins}분 {secs}초")
