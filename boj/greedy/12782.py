import itertools
import heapq
import bisect
import collections
import math
import sys

t= int(input())

for i in range(t):
    n, m = input().split()
    diff_count = 0
    for i in range(len(n)):
        if (n[i] != m[i]):
            diff_count += 1

    cn = n.count("1")
    cm = m.count("1")
    op1 = abs(cn - cm)

    count = (diff_count + op1)  // 2
    print(count)

