import itertools
import heapq
import bisect
import collections
import math
import sys

a, b = map(int, input().split())

count = 1
while (a < b):
    if (b % 2 == 0):
        b //= 2
        count += 1
    elif (b % 10 == 1):
        b //= 10
        count += 1
    else:
        break;

print(count if b == a else -1)