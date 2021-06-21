import itertools
import heapq
import bisect
import collections
import math
import sys

n = int(input())

data = []
for i in range(n):
    data.append(tuple(map(int, input().split())))
data.sort(key=lambda x: (x[1], x[0]))

count = 0
comp = 0
for i in range(n):
    if (data[i][0] >= comp):
        comp = data[i][1]
        count += 1

print(count)
