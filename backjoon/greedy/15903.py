import itertools
import heapq
import bisect
import collections
import math
import sys

n, m = map(int, input().split())

data = list(map(int, input().split()))

for i in range(m):
    data.sort()
    data[0] = data[0] + data[1]
    data[1] = data[0]
        
print(sum(data))