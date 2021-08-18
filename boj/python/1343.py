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
res = ""
flagflag = False
while idx < len(n):
    if n[idx] == "X":
        if idx + 3 < len(n) and n[idx : idx + 4] == "XXXX":
            res += "AAAA"
            idx += 4
        elif idx + 1 < len(n) and n[idx : idx + 2] == "XX":
            res += "BB"
            idx += 2
        else:
            flagflag = True
            break
    else:
        res += "."
        idx += 1

print(-1 if flagflag else res)
