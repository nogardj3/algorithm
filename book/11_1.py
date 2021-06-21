import itertools
import heapq
import bisect
import collections
import math
import sys

n = int(input())
data = list(map(int, input().split()))

data.sort()


result = 0
count = 0
for i in data:
    result += 1
    if result >= i:
        count += 1
        result = 0

print(count)
