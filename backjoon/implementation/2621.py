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

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
import sys

input = lambda: sys.stdin.readline().strip()
############################################


def is_continuous():
    if len(list_number) == 5:
        prev_num = list_number[0]
        for item in list_number:
            if item - prev_num != 1:
                return False
        return True
    else:
        return False


def check_same_number():
    global is_4_same, is_3_same, is_2_same
    for i in range(list_counter):
        if list_counter[i] == 4:
            is_4_same = i
        elif list_counter[i] == 3:
            is_3_same = i
        elif list_counter[i] == 2:
            is_2_same.append(i)


dict_color = dict()
list_number = []
list_counter = [0] * 10
max_num = -1

for i in range(5):
    color, number = input().split()
    number = int(number)
    if color not in dict_color:
        dict_color[color] = [number]
    else:
        dict_color[color].append(number)

    list_number.append(number)
    list_counter[number] += 1
    max_num = max(max_num, number)

is_same_color = len(dict_color.keys()) == 5
is_continuous = check_continuous()

is_4_same = -1
is_3_same = -1
is_2_same = []

check_same_number()

if is_same_color and is_continuous:
    print(900 + max_num)
elif is_4_same != -1:
    print(800 + is_4_same)
elif is_3_same != -1 and is_2_same != -1:
    print(700 + is_3_same * 10 + is_2_same)
