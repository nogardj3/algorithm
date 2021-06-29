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

idx = 0
for i in range(len(n)):
    if n[i] == "U" and idx == 0:
        idx = 1
    if n[i] == "C" and idx == 1:
        idx = 2
    if n[i] == "P" and idx == 2:
        idx = 3
    if n[i] == "C" and idx == 3:
        idx = 4
    if idx == 4:
        break

print("I love UCPC" if idx == 4 else "I hate UCPC")
