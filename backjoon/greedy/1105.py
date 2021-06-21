import itertools
import heapq
import bisect
import collections
import math
import sys

l, r = input().split()

count = 0
if (len(l) == len(r)):
    for i in range(len(r)):
        if ((l[i] == r[i]) and l[i] == '8'):
            count += 1
        elif(l[i]!=r[i]):
            break;
            
print(count)