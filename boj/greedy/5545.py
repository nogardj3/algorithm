import itertools
import heapq
import bisect
import collections
import math
import sys

n= int(input())
a, b = map(int, input().split())
c = int(input())

data=[]
for i in range(n):
    data.append(int(input()))
data.sort(reverse=True)

count = 0
cur_sum = 0
res = c / a
for i in range(n):
    sum_cal = c + (cur_sum + data[i])
    sum_price = a + (count + 1) * b
    temp = sum_cal / sum_price

    if (res < temp):
        res = temp
        count += 1
        cur_sum += data[i]
    else:
        break;

print(int(res))