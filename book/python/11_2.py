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

n = input()
res = 0

for i in n:
    res = max(res + int(i), res * int(i))

print(res)
