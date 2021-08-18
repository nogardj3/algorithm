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

n, k = map(int, input().split())

index = 0

check = [0] * 1001
flag = False
for i in range(2, n + 1):
    for j in range(i, n + 1, i):
        if check[j] == 0:
            check[j] = 1
            index += 1
        if index == k:
            flag = True
            break
    if flag:
        print(j)
        break
