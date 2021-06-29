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


def check_is_palindrome(stst):
    for i in range(len(stst) // 2):
        if stst[i] != stst[len(stst) - i - 1]:
            return 2
    return 1


t = int(input())

for i in range(t):
    origin_str = input()

    res = 0
    n = len(origin_str)

    for i in range(n // 2):
        if origin_str[i] != origin_str[n - i - 1]:
            res = check_is_palindrome(origin_str[:i] + origin_str[i + 1 :])
            if res == 2:
                res = check_is_palindrome(origin_str[: n - i - 1] + origin_str[n - i :])
            break

    print(res)
