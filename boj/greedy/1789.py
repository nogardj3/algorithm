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

t = int(input())

res = 0
last_num = 0
while res <= t:
    last_num += 1
    res += last_num

print(last_num - 1)
