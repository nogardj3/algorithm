import itertools
import heapq
import bisect
import collections
import math
import sys

n = input()
stst = input()

count = 0

while (n.find(stst) != -1):
    n = n[(n.find(stst) + len(stst)) :]
    count += 1

print(count)