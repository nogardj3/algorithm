import itertools
import heapq
import bisect
import collections
import math
import sys

#FAIL

s = input()
s = ''.join(sorted(s))
# index_start = 0
# index_min = 0
# val_min = 'z'

# while (index_start < len(s)):
#     flag = False
#     val_min = s[index_start]
#     for i in range(index_start,len(s)):
#         if val_min > s[i]:
#             index_min = i
#             val_min = s[i]
#             flag = True
#     if(flag):
#         str_spl1 = s[index_start: index_min + 1]
#         str_spl2 = s[index_min + 1: len(s)]
#         s = s[0:index_start] + str_spl1[::-1] + str_spl2
#     index_start += 1
#     print(s)

print(s)