import itertools
import heapq
import bisect
import collections
import math
import sys

t = int(input())

for i in range(t):
    n= int(input())
    data = list(map(int, input().split()))
    data.sort()

    res = 0
    for i in range(2,n):
        res = max(res, abs(data[i] - data[i-2]))
        
    print(res)