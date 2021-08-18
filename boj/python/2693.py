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
    data = list(map(int, input().split()))
    data.sort(reverse=True)
    print(data[2])
