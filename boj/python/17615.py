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

# FAILED

n = int(input())

arr = list(input())
red = arr.count("R")
blue = n - red

ans = min(red, blue)
cnt = 0
for i in range(n):
    if arr[i] != arr[0]:
        break
    cnt += 1
if arr[0] == "R":
    ans = min(ans, red - cnt)
else:
    ans = min(ans, blue - cnt)

cnt = 0
for i in range(n - 1, -1, -1):
    if arr[i] != arr[n - 1]:
        break
    cnt += 1

if arr[n - 1] == "R":
    ans = min(ans, red - cnt)
else:
    ans = min(ans, blue - cnt)

print(ans)
