# 20251271 최준오
# 03-05

lst1 = [0, 1, 0, 0, 0, 0]
# any(a list with at least one non-zero entry) returns True
print(any(lst1), all(lst1))

lst2 = [0, 0.0, 0, 0.0, 0]
# any(a list of zeros) returns False
print(any(lst2), all(lst2))

lst3 = [True, False, False]
# any(a list with at least one True value) returns True
print(any(lst3), all(lst3))

lst4 = ["", "", "code more"]
# any(a list with at least one non-empty string) returns True
print(any(lst4), all(lst4))

lst5 = ["", "", ""]
# any(a list of empty strings) returns False
print(any(lst5), all(lst5))
