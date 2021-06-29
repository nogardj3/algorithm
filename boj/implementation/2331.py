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

a, p = map(int, input().split())

res = dict()
res[a] = 1
while True:
    temp = 0
    for item in str(a):
        temp += pow(int(item), p)
    a = temp

    if a not in res:
        res[a] = 1
    elif res[a] == 1:
        res[a] = 2
    elif res[a] == 2:
        break

count = 0
for item in res:
    if res[item] == 1:
        count += 1
print(count)
