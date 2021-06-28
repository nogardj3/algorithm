import itertools
import heapq
import bisect
import collections
import math
import sys

n, k = map(int, input().split())

arr = []
for i in range(n):
    arr.append(int(input()))

arr.sort(reverse=True)

count =0 
for item in arr:
    count += k // item
    k = k % item

print(count)