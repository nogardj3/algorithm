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

len_n = len(str(n))

if len_n == 1:
    print(n)
else:
    res = 0
    for i in range(1, len_n):
        res += 9 * i * 10 ** (i - 1)

    tt = len_n * ((n - (10 ** (len_n - 1))) + 1)
    res += tt
    print(res)
