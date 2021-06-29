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

data.sort()


result = 0
count = 0
for i in data:
    result += 1
    if result >= i:
        count += 1
        result = 0

print(count)
