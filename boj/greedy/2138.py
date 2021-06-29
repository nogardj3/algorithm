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

n = int(input())

sttt = input()
src_str = list(sttt)
src2_str = list(sttt)
dest_str = list(input())

# 0번 안누름
count = 0
for i in range(1, n):
    if src2_str[i - 1] != dest_str[i - 1]:
        src2_str[i - 1] = "0" if src2_str[i - 1] == "1" else "1"
        src2_str[i] = "0" if src2_str[i] == "1" else "1"
        if i + 1 != n:
            src2_str[i + 1] = "0" if src2_str[i + 1] == "1" else "1"
        count += 1

if src2_str != dest_str:
    # 0번 누름
    src_str[0] = "0" if src_str[0] == "1" else "1"
    src_str[1] = "0" if src_str[1] == "1" else "1"

    count = 1
    for i in range(1, n):
        if src_str[i - 1] != dest_str[i - 1]:
            src_str[i - 1] = "0" if src_str[i - 1] == "1" else "1"
            src_str[i] = "0" if src_str[i] == "1" else "1"
            if i + 1 != n:
                src_str[i + 1] = "0" if src_str[i + 1] == "1" else "1"
            count += 1

    print(count if src_str == dest_str else -1)
else:
    print(count)
