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

for i in range(1, n + 1):
    if i % 10 == 0:
        print(i, end=" ")
    elif (i % 10) % 3 == 0:
        print("X", end=" ")
    else:
        print(i, end=" ")
