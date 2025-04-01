# 20251271 최준오
# 02-07

# mutuable object
os = ["unix", "mac", "windows"]
print("id(os)", id(os))
os.append("linux")
print("id(os)", id(os))

# immutable object
py = "python"
print("id(py)", id(py))
py = "python" + "language"
print("id(os)", id(py))
