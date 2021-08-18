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
    data = int(input())
data.reverse()

delete_count = 0
res = 0
for item in data:
    if item == 0:
        delete_count += 1
    else:
        if delete_count != 0:
            delete_count -= 1
        else:
            res += item

print(res)
