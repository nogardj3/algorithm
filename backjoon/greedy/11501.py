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
n= int(input())
for i in range(n):
    data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
t = int(input())

for i in range(t):
    n = int(input())
    data = list(map(int, input().split()))
    
    res = 0
    max_index = n - 1
    max_val = data[n-1]
    for i in range(n-2,-1,-1):
        if data[i] > max_val:
            max_val = data[i]
        elif data[i] < max_val:
            res += max_val - data[i]
        # print('',i)

    print(res)