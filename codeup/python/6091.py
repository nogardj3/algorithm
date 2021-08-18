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

a, b, c = map(int, input().split())

d = 1
while d % a != 0 or d % b != 0 or d % c != 0:
    d += 1

print(d)
