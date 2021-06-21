import itertools
import heapq
import bisect
import collections
import math
import sys
import time

n = int(input())

data = []
for i in range(n):
    data.append(int(sys.stdin.readline()))
data.sort(reverse=True)

res = 0

for i in range(n):
    tip = data[i] - (i)
    res += tip if tip>0 else 0

print(res)