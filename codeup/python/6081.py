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

n = int(input(), 16)

for i in range(1, 16):
    print("%X" % n, "*%X" % i, "=%X" % (n * i), sep="")
