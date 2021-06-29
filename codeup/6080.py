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

n, m = map(int, input().split())

for i in range(1, n + 1):
    for j in range(1, m + 1):
        print(f"{i} {j}")
