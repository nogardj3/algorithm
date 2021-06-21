import itertools
import heapq
import bisect
import collections
import math
import sys
import time

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
    
    src_data = input()
    dest_data = input()

    count_w = 0
    count_b = 0
    for i in range(n):
        if (src_data[i] != dest_data[i]):
            if (src_data[i] == 'W') :
                count_w += 1
            else:
                count_b += 1
    
    print(min(count_w,count_b) + abs(count_w-count_b))
