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
n = input()

idx = 0
res = ''
flagflag = False
while (idx < len(n)):
    if n[idx] == 'X':
        if(idx + 3 <len(n) and n[idx:idx+4] == 'XXXX'):
            res += 'AAAA'
            idx += 4
        elif(idx + 1 <len(n) and n[idx:idx+2] == 'XX'):
            res += 'BB'
            idx += 2
        else:
            flagflag = True
            break;
    else:
        res += '.'
        idx += 1

print(-1 if flagflag else res)
