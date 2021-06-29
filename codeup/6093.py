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
a = list(map(int, input().split()))

for i in range(n - 1, -1, -1):
    print(a[i], end=" ")
