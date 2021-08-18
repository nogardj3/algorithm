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


def check_continuous():
    if len(list_number) == 5:
        for i in range(1, len(list_number)):
            if list_number[i] - list_number[i - 1] != 1:
                return False
        return True
    else:
        return False


def check_same_number():
    global is_4_same, is_3_same, is_2_same
    for i in range(len(list_counter)):
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
list_number.sort()

is_same_color = len(dict_color.keys()) == 1
is_continuous = check_continuous()

is_4_same = -1
is_3_same = -1
is_2_same = []

check_same_number()

if is_same_color and is_continuous:
    print(900 + max_num)
elif is_4_same != -1:
    print(800 + is_4_same)
elif is_3_same != -1 and len(is_2_same) != 0:
    print(700 + is_3_same * 10 + is_2_same[0])
elif is_same_color:
    print(600 + max_num)
elif is_continuous:
    print(500 + max_num)
elif is_3_same != -1:
    print(400 + is_3_same)
elif len(is_2_same) == 2:
    print(300 + max(is_2_same) * 10 + min(is_2_same))
elif len(is_2_same) == 1:
    print(200 + is_2_same[0])
else:
    print(100 + max_num)
