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

n, score, p = map(int, input().split())

if n == 0:
    print(1)
else:
    scores = list(map(int, list(input().split())))

    if n == p and scores[-1] >= score:
        print(-1)
    else:
        scores.append(score)
        scores.sort(reverse=True)

        res = 0
        for i in range(len(scores)):
            if scores[i] == score:
                res = i
                break

        print(res + 1)
