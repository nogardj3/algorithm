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

n = list(input())
n.insert(0, "N")

count = 0

for i in range(1, len(n)):
    if n[i] == "Y":
        for j in range(i, len(n), i):
            if n[j] == "Y":
                n[j] = "N"
            else:
                n[j] = "Y"
        count += 1

print(count)
