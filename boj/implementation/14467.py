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

data = dict()

count = 0
for i in range(n):
    cow, lr = map(int, input().split())
    if cow not in data:
        data[cow] = lr
    else:
        if data[cow] != lr:
            count += 1

print(count)
