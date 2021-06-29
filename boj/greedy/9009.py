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

    num1 = 0
    num2 = 1

    data = []
    while n != 0:
        new_val = num1 + num2
        if new_val > n:
            n -= num2
            data.append(num2)
            num1 = 0
            num2 = 1
        elif new_val == n:
            data.append(new_val)
            break
        else:
            num1 = num2
            num2 = new_val

    for i in range(len(data) - 1, -1, -1):
        print(data[i], end=" ")
    print()
