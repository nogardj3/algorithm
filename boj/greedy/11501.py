import itertools
import heapq
import bisect
import collections
import math
import sys

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

    print(res)