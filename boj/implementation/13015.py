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

N = int(input())
print("*" * N + " " * (2 * N - 3) + "*" * N)
for i in range(N - 2):
    print(
        " " * (i + 1)
        + "*"
        + " " * (N - 2)
        + "*"
        + " " * ((N - 2 - i) * 2 - 1)
        + "*"
        + " " * (N - 2)
        + "*"
    )
print(" " * (N - 1) + "*" + " " * (N - 2) + "*" + " " * (N - 2) + "*")
for i in range(N - 3, -1, -1):
    print(
        " " * (i + 1)
        + "*"
        + " " * (N - 2)
        + "*"
        + " " * ((N - 2 - i) * 2 - 1)
        + "*"
        + " " * (N - 2)
        + "*"
    )
print("*" * N + " " * (2 * N - 3) + "*" * N)
