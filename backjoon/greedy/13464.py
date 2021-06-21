import itertools
import heapq
import bisect
import collections
import math
import sys
import time

# Failed

n,k = map(int,input().split())

data = list(map(int, input().split()))
diff_arr = []

for i in range(n - 1):
    diff_arr.append(data[i + 1] - data[i])
diff_arr.sort()

print(sum(diff_arr[:n-k]))