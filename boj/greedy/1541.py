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

arr = input().split("-")

res = 0

for i in arr[0].split("+"):
    res += int(i)
for i in arr[1:]:
    for j in i.split("+"):
        res -= int(j)

print(res)
