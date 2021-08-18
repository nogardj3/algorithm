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

target_str = input()

stackS = []
stackB = []
coeff = 1
isPaired = True
ans = 0

for i in range(len(target_str)):
    if target_str[i] == "(":
        stackS.append(i)
        coeff *= 2
    elif target_str[i] == "[":
        stackB.append(i)
        coeff *= 3
    elif target_str[i] == ")":
        if stackS:
            if target_str[i - 1] == "(":
                ans += coeff
            stackS.pop()
            coeff //= 2
        else:
            isPaired = False
            break
    elif target_str[i] == "]":
        if stackB:
            if target_str[i - 1] == "[":
                ans += coeff
            stackB.pop()
            coeff //= 3
        else:
            isPaired = False
            break

if not stackB and not stackS and isPaired:
    print(ans)
else:
    print(0)
