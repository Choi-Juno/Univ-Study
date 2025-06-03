original_price = 30000
discount_percent = 20


def calculate_discounted_price(original_price, discount_percent):
    result = original_price * (1 - discount_percent / 100)
    return result
