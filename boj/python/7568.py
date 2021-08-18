import itertools
import heapq
import bisect
import collections
import math
import time
import re
import copy

############################################
import sys

input = lambda: sys.stdin.readline().strip()
############################################

n = int(input())

data = []
for i in range(n):
    data.append(tuple(map(int, input().split())))

res = ""
for item in data:
    rank = 1
    for j in data:
        if item[0] < j[0] and item[1] < j[1]:
            rank += 1
    res += str(rank) + " "

print(res)
