items = {"사과": 2000, "바나나": 1500, "오이": 1000}

while True:
    print("\n원하는 것을 선택하시오: ")
    print("1. 가격표 출력")
    print("2. 상품 가격 검색")
    print("3. 가격 업데이트")
    print("4. 상품 추가")
    print("5. 종료")
    choice = int(input("선택: "))

    if choice == 1:
        print("\n상품 목록 및 가격: ")
        for item, price in items.items():
            print(f"{item}: {price}원")
    elif choice == 2:
        item = input("검색할 상품 이름을 입력하세요: ")
        if item in items:
            print(f"{item}의 가격은 {items[item]}원 입니다.")
        else:
            print(f"{item}은 없는 상품입니다.")
    elif choice == 3:
        item = input("가격을 업데이트할 상품 이름을 입력하시오: ")
        if item in items:
            newPrice = int(input("새로운 가격을 입력하시요: "))
            items[item] = newPrice
            print(f"{item}의 가격이 {newPrice}원으로 업데이트 되었습니다.")
        else:
            print(f"{item}은 없는 상품입니다.")
            continue
    elif choice == 4:
        item = input("추가할 상품 이름을 입력하세요: ")
        price = int(input("가격을 입력하세요: "))
        items[item] = price
        print(f"{item}: {price}원 이 추가되었습니다.")
    elif choice == 5:
        break
