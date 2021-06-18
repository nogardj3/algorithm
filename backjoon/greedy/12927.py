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
n= list(input())
n.insert(0, 'N')

count = 0

for i in range(1, len(n)):
    if n[i] == 'Y':
        for j in range(i, len(n), i):
            if n[j] == 'Y':
                n[j] = 'N'
            else:
                n[j] = 'Y'
        count += 1
            
print(count)
