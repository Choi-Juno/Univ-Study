companies = {
    "삼성에스디에스": 242000,
    "삼성전자": 47000,
    "엔씨소프트": 52600,
    "핸디소프트": 5120,
    "골프존": 215000,
    "기아": 56300,
}

while True:
    company = input("주식 이름? ")
    if company in companies:
        print(f"{company}: {companies[company]}")
    else:
        print("주식 이름이 없습니다")
        break
