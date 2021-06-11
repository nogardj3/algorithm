n, m = map(int, input().split())  # n,m 받기

res = 0
for i in range(n):
    data = list(map(int, input().split()))  # n개 받기

    minimum = min(data)
    res = max(minimum, res)

print(res)
