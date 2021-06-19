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

data = list(map(int, input().split()))

for i in range(m):
    data.sort()
    data[0] = data[0] + data[1]
    data[1] = data[0]
        
print(sum(data))

# for j  in range(len(data)-1):
#     if (data[j] != data[j + 1]):
#         data[j] = data[j] + data[j + 1]
#         data[j + 1] = data[j]
#         break;
# print(data)