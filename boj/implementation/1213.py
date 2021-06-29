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

name = input()

if len(name) == 1:
    print(name)
    exit(0)

data = [0] * (ord("Z") - ord("A") + 1)

for item in name:
    data[ord(item) - ord("A")] += 1

res = ""
if len(name) % 2 == 1:
    for i in range(len(data) - 1, -1, -1):
        if data[i] % 2 == 1:
            res = chr(i + ord("A"))
            data[i] -= 1
            break

    for i in range(len(data) - 1, -1, -1):
        if data[i] % 2 == 1:
            print("I'm Sorry Hansoo")
            exit(0)
        for j in range(0, data[i], 2):
            charchar = chr(i + ord("A"))
            res = charchar + res
            res = res + charchar
else:
    for i in range(len(data) - 1, -1, -1):
        if data[i] % 2 == 1:
            print("I'm Sorry Hansoo")
            exit(0)
        else:
            for j in range(0, data[i], 2):
                charchar = chr(i + ord("A"))
                res = charchar + res
                res = res + charchar

print(res)
