import itertools
import heapq
import bisect
import collections
import math
import time
import re


"""
# 단순 공백 기준 여러개 받기
n, m = map(int, input().split())

# n * m 2차원 배열 받기
n = int(input())
for i in range(n):
    data = list(map(int, input().split()))

data = [list(map(int, input())) for _ in range(n)]

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
import sys

input = lambda: sys.stdin.readline().strip()
############################################

origin_data = input()

res = ""
temp_data = ""
tag_flag = False
for i in range(len(origin_data)):
    if tag_flag:
        if origin_data[i] == ">":
            temp_data += ">"
            res += temp_data
            temp_data = ""
            tag_flag = False
        else:
            temp_data += origin_data[i]
    else:
        if origin_data[i] == "<":
            res += temp_data[::-1]
            temp_data = "<"
            tag_flag = True
        elif origin_data[i] == " ":
            res += temp_data[::-1] + " "
            temp_data = ""
        else:
            temp_data += origin_data[i]
print(res + temp_data[::-1])
