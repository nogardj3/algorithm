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

h, b, c, s = map(int, input().split())

print(f"{round(h*b*c*s/8/1024/1024,1)} MB")
