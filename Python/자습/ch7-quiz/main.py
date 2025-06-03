from calculator import calculate_discounted_price, original_price, discount_percent

print(f"원가격: {original_price}원")
print(f"할인율: {discount_percent}%")
print(
    f"할인된 가격: {calculate_discounted_price(original_price, discount_percent):.2f}"
)

print()

original_price = int(input("소둑: "))
discount_percent = int(input("소득세율: "))
print(
    f"소득세: {(original_price - calculate_discounted_price(original_price, discount_percent)):.2f}원"
)
