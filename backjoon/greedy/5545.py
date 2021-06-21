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

n= int(input())
a, b = map(int, input().split())
c = int(input())

data=[]
for i in range(n):
    data.append(int(input()))
data.sort(reverse=True)

count = 0
cur_sum = 0
res = c / a
for i in range(n):
    sum_cal = c + (cur_sum + data[i])
    sum_price = a + (count + 1) * b
    temp = sum_cal / sum_price

    if (res < temp):
        res = temp
        count += 1
        cur_sum += data[i]
    else:
        break;

print(int(res))