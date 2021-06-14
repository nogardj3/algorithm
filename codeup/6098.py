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
mx = 10
my = 10

d = []  # 대괄호 [ ] 를 이용해 아무것도 없는 빈 리스트 만들기
for i in range(mx):
    d.append(list(map(int, input().split())))  # n개 받기


x = 1
y = 1

while True:
    if d[x][y] == 2:
        d[x][y] = 9
        break

    d[x][y] = 9

    if d[x][y + 1] != 1:
        y = y + 1
    elif d[x + 1][y] != 1:
        x = x + 1
    else:
        break


for e in range(mx):
    for r in range(my):
        print(d[e][r], end=" ")  # 공백을 두고 한 줄로 출력
    print()  # 줄 바꿈
