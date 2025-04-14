hex1 = input("첫 번째 16진수 실수 입력 >> ")
hex2 = input("두 번째 16진수 실수 입력 >> ")

hex1ToFloat = float.fromhex(hex1)
hex2ToFloat = float.fromhex(hex2)

print(f"첫 번째 입력 값: {hex1}, 10진수: {hex1ToFloat}")
print(f"두 번째 입력 값: {hex2}, 10진수: {hex2ToFloat}")

print(f"합하기: {(hex1ToFloat + hex2ToFloat):.4f}")
print(f"빼기: {(hex1ToFloat - hex2ToFloat):.4f}")
print(f"곱하기: {(hex1ToFloat * hex2ToFloat):.4f}")
print(f"나누기: {(hex1ToFloat / hex2ToFloat):.4f}")
