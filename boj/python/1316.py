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
for i in range(t):
    target_str = input()
    checks = {}

    count = 1
    for i in range(len(target_str)):
        if not (target_str[i] in checks):
            checks[target_str[i]] = True
        elif target_str[i - 1] == target_str[i]:
            pass
        else:
            count = 0
            break
    res += count

print(res)
