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

for i in range(1, 1000 + 1):
    sum += i
    if sum >= n:
        print(i)
        break
