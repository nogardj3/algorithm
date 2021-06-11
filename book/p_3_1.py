import random

# n = random.randrange(1,100) * 10
n = 1260
left = [500, 100, 50, 10]

res = 0

print(n, res)
for t in left:
    res += n // t
    n %= t
    print(n, res)
