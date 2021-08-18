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

data = list(map(int, input().split()))

res = [i for i in range(1, 6)]

last = 5
if data == res:
    print(*res)
else:
    while data != res:
        for i in range(last - 1):
            if data[i] > data[i + 1]:
                data[i], data[i + 1] = data[i + 1], data[i]
                print(*data)
        last -= 1
