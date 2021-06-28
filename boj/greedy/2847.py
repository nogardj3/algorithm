import itertools
import heapq
import bisect
import collections
import math
import sys

n= int(input())

data=[]
for i in range(n):
    data.append(int(input()))

count = 0
for i in range(n - 1, 0, -1):
    if (data[i] <= data[i - 1]):
        count += data[i-1] - data[i] +1
        data[i - 1] = data[i] - 1

print(count)