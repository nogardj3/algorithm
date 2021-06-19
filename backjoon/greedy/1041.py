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
n = input()
data = list(map(int, input().split()))

res = 0
if n == 1:
    data.sort()
    res = sum(data[:5])
else:
    select_arr = []
    select_arr.append(min(data[0], data[5]))
    select_arr.append(min(data[1], data[4]))
    select_arr.append(min(data[2], data[3]))
    select_arr.sort()

    min1 = select_arr[0]
    min2 = select_arr[0] + select_arr[1]
    min3 = select_arr[0] + select_arr[1] + select_arr[2]

    n1 = (n-2)*(n-2) + 4*(n-1)*(n-2)
    n2 = 4*(n-2) + 4*(n-1)
    n3 = 4

    res += n1 * min1
    res += n2 * min2
    res += n3 * min3

print(res)
