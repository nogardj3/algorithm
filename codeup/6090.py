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

a, m, d, n = map(int, input().split())

for i in range(1, n):
    a = a * m + d

print(a)
