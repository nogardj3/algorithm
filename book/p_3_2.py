n, m, k = map(int, input().split())  # n,m,k 받기
data = list(map(int, input().split()))  # n개 받기

data.sort()  # 오름차순
first = data[n - 1]  # 마지막 인덱스
second = data[n - 2]  # 그 다음 인덱스

res = 0
if first == second:
    res = first * m
else:
    length = m // (k + 1)
    left = m % length
    print(length, left)
    res = (first * k + second * 1) * length + left * first

print(res)
