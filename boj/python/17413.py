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
