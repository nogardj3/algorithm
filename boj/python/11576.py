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

a, b = map(int, input().split())

m = int(input())

data = list(input().split())

dec_val = 0
for i in range(m):
    dec_val += int(data[i]) * pow(a, (m - i - 1))

res = []

while dec_val != 0:
    res.append(dec_val % b)
    dec_val //= b

while len(res) != 0:
    print(res.pop(), end=" ")
