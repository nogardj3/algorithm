import itertools
import heapq
import bisect
import collections
import math
import sys

"""
# 단순 공백 기준 여러개 받기
n, m = map(int, input().split())

# n * m 2차원 배열 받기
n, m = int(input())
for i in range(n):
    data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
d = []  # 대괄호 [ ] 를 이용해 아무것도 없는 빈 리스트 만들기
for i in range(19):
    d.append(list(map(int, input().split())))  # n개 받기

n = int(input())
for i in range(n):
    x, y = map(int, input().split())
    x -= 1
    y -= 1
    for j in range(19):
        if d[j][int(y)] == 0:
            d[j][int(y)] = 1
        else:
            d[j][int(y)] = 0

        if d[int(x)][j] == 0:
            d[int(x)][j] = 1
        else:
            d[int(x)][j] = 0

for i in range(19):
    for j in range(19):
        print(d[i][j], end=" ")  # 공백을 두고 한 줄로 출력
    print()  # 줄 바꿈
