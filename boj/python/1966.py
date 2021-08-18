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

for i in range(t):
    n, m = map(int, input().split())
    data = list(map(int, input().split()))

    count = 0
    while True:
        if data[0] == max(data):
            count += 1
            if m == 0:
                print(count)
                break
            else:
                del data[0]
                m -= 1
        else:
            data.append(data[0])
            del data[0]
            m = len(data) - 1 if m == 0 else m - 1
