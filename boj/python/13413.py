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
    n = int(input())

    src_data = input()
    dest_data = input()

    count_w = 0
    count_b = 0
    for i in range(n):
        if src_data[i] != dest_data[i]:
            if src_data[i] == "W":
                count_w += 1
            else:
                count_b += 1

    print(min(count_w, count_b) + abs(count_w - count_b))
