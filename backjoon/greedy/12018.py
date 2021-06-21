import itertools
import heapq
import bisect
import collections
import math
import sys

n, m = map(int, input().split())

available_data = []
for i in range(n):
    p, l = map(int, input().split())

    data = list(map(int, input().split()))
    data.sort(reverse=True)

    temp_val = 0
    if(p>=l):
        temp_val = data[l-1]
    else:
        temp_val = 1
    
    available_data.append(temp_val)

available_data.sort()

sum = 0
count = 0
for i in range(len(available_data)):
    if (sum + available_data[i] <= m):
        sum += available_data[i]
        count += 1
    else:
        break;

print(count)