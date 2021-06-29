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
data = list(map(int, input().split()))
data.sort(reverse=True)

for i in range(n):
    data[i] += i + 1 + 1

print(max(data))
