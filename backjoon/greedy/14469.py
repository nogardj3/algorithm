import itertools
import heapq
import bisect
import collections
import math
import sys
import time

n = int(input())

data=[]
for i in range(n):
    data.append(tuple(map(int, input().split())))
    
data.sort()

idx = 0
for i in range(n):
    if (idx > data[i][0]):
        idx += data[i][1]
    else:
        idx = data[i][0] + data[i][1]

print(idx)
