import itertools
import heapq
import bisect
import collections
import math
import sys

n = int(input())
data = list(map(int, input().split()))
data.sort(reverse=True)

for i in range(n):
    data[i] +=  i + 1 + 1

print(max(data))