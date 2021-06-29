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
sum = 0

for i in range(1, n + 1):
    if i % 2 == 0:
        sum += i

print(sum)
