import itertools
import heapq
import bisect
import collections
import math
import sys

n, w = map(int, input().split())

data = []
for i in range(n):
    data.append(int(input()))

count = 0
prev_val = data[0]

for i in range(1, n):
    if (prev_val > data[i] and count != 0):
        w += count * prev_val
        count = 0
    elif (prev_val < data[i] and count == 0):
        count = w // prev_val
        w -= count * prev_val
    prev_val= data[i]

if (count != 0):
    w+= count * data[n-1]

print(w)