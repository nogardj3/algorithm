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

h, w = map(int, input().split())
n = int(input())

d = []  # 대괄호 [ ] 를 이용해 아무것도 없는 빈 리스트 만들기
for i in range(h):
    d.append([])  # 리스트 안에 다른 리스트 추가해 넣기
    for j in range(w):
        d[i].append(0)  # 리스트 안에 들어있는 리스트 안에 0 추가해 넣기

for i in range(n):
    l, t, x, y = map(int, input().split())  # n개 받기
    x -= 1
    y -= 1
    if t == 0:
        for j in range(y, y + l):
            d[x][j] = 1
    else:
        for j in range(x, x + l):
            d[j][y] = 1

for e in range(h):
    for r in range(w):
        print(d[e][r], end=" ")  # 공백을 두고 한 줄로 출력
    print()  # 줄 바꿈
