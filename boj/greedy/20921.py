import itertools
import heapq
import bisect
import collections
import math
import sys

# failed

n, m = map(int, input().split())

ll = []
for i in range(n):
    ll.append(i + 1)

count = 0
for k in range(n):
    if count == m:
        break;
    for i in range(n - 1, k, -1):
        if (ll[i] > ll[i - 1]):
            ll[i],ll[i-1] = ll[i-1],ll[i]
            count += 1
        if count == m:
            break;

print(ll)