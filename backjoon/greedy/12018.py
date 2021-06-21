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

n, m = map(int, input().split())

available_data = []
for i in range(n):
    p, l = map(int, input().split())

    data = list(map(int, input().split()))
    data.sort(reverse=True)

    temp_val = 0
    if(p>=l):
        temp_val = data[l-1]
    else:
        temp_val = 1
    
    available_data.append(temp_val)

available_data.sort()

sum = 0
count = 0
for i in range(len(available_data)):
    if (sum + available_data[i] <= m):
        sum += available_data[i]
        count += 1
    else:
        break;

print(count)