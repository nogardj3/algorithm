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
    arr= []
    for j in range(n):
        arr.append(tuple(map(int,sys.stdin.readline().split())))

    arr.sort(key=lambda x: (x[0]))
    max_num = arr[0][1]
    count = 0
    for j in range(n):
        if (max_num >= arr[j][1]):
            count +=1
            max_num = arr[j][1]

    print(count)