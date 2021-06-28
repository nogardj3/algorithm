import itertools
import heapq
import bisect
import collections
import math
import sys

t = int(input())

for i in range(t):
    n = int(input())
    arr= []
    for j in range(n):
        arr.append(tuple(map(int,sys.stdin.readline().split())))

    arr.sort(key=lambda x: (x[0]))
    max_num = arr[0][1]
    count = 0
    for j in range(n):
        if (max_num >= arr[j][1]):
            count +=1
            max_num = arr[j][1]

    print(count)