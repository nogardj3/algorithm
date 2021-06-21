import itertools
import heapq
import bisect
import collections
import math
import sys

t = int(input())

for i in range(t):
    n = int(input())

    data = list(input().split())

    a = collections.deque()
    a.append(data[0])
    for i in range(1,n):
        if (data[i] > a[0]):
            a.append(data[i])
        else:
            a.appendleft(data[i])
    print(''.join(a))
