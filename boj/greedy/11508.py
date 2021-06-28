import itertools
import heapq
import bisect
import collections
import math
import sys
import time

n = int(input())

data= []
for i in range(n):
    data.append(int(input()))
data.sort(reverse=True)

for i in range(2, n, 3):
    data[i] = 0

print(sum(data))