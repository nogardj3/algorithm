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

w, h, b = map(int, input().split())

print("%.2f MB" % (round(w * h * b / 8 / 1024 / 1024, 2)))
