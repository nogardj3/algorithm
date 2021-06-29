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
data = list(input().split())

direction = {
    "R": [0, 1],
    "L": [0, -1],
    "U": [-1, 0],
    "D": [1, 0],
}
pos = [0, 0]
for i in range(len(data)):
    pos[0] += direction[data[i]][0]
    pos[1] += direction[data[i]][1]
    if pos[0] < 0:
        pos[0] = 0
    elif pos[0] > n - 1:
        pos[0] = n - 1
    if pos[1] < 0:
        pos[1] = 0
    elif pos[1] > n - 1:
        pos[1] = n - 1

print(f"{pos[0]+1} {pos[1]+1}")
