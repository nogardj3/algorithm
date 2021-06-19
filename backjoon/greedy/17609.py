import itertools
import heapq
import bisect
import collections
import math
import sys

"""
# 단순 공백 기준 여러개 받기
n, m = map(int, input().split())

# n * m 2차원 배열 받기
n= int(input())
for i in range(n):
    data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
def check_is_palindrome(stst):
    for i in range(len(stst) // 2):
        if (stst[i] != stst[len(stst) - i - 1]):
            return 2
    return 1

t = int(input())

for i in range(t):
    origin_str = input()

    res = 0
    n = len(origin_str)

    for i in range(n // 2):
        if (origin_str[i] != origin_str[n - i - 1]):
            res = check_is_palindrome(origin_str[:i] + origin_str[i + 1 :])
            if (res == 2):
                res = check_is_palindrome(origin_str[:n-i-1]+origin_str[n-i:])
            break;

    print(res)
