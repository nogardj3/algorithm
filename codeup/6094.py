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
a = list(map(int, input().split()))
min_num = 1e9

for i in range(n):
    min_num = min(a[i], min_num)
print(min_num)
