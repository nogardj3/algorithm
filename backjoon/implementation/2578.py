import itertools
import heapq
import bisect
import collections
import math
import time
import re


"""
# 단순 공백 기준 여러개 받기
n, m = map(int, input().split())

# n * m 2차원 배열 받기
n = int(input())
for i in range(n):
    data = list(map(int, input().split()))

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
import sys

input = lambda: sys.stdin.readline().strip()
############################################
def isbingo():
    global data, n, index
    bingo_count = 0

    # 행
    bingo_count += data.count([0, 0, 0, 0, 0])

    # 열
    for i in range(n):
        flag = True
        for j in range(n):
            if data[j][i] != 0:
                flag = False
                break
        if flag:
            bingo_count += 1

    # 대각선1
    flag = True
    for i in range(n):
        if data[i][i] != 0:
            flag = False
            break
    bingo_count += 1 if flag else 0
    # 대각선2
    flag = True
    for i in range(n):
        if data[i][n - i - 1] != 0:
            flag = False
            break
    bingo_count += 1 if flag else 0

    return bingo_count >= 3


n = 5

data = []
for i in range(n):
    data.append(list(map(int, input().split())))

index = 0
for i in range(n):
    tt = list(map(int, input().split()))
    for j in range(n):
        # 체크하기
        flag = False
        for k in range(n):
            for l in range(n):
                if tt[j] == data[k][l]:
                    data[k][l] = 0
                    flag = True
                    break
            if flag:
                break
        index += 1
        # 검사하기
        if isbingo():
            print(index)
            exit(0)
