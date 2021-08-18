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


def draw(x, y):
    global white
    for i in range(x + 1, x + 11):
        for j in range(y + 1, y + 11):
            white[i][j] = 1


t = int(input())
white = [[0 for col in range(102)] for row in range(102)]

for _ in range(t):
    x, y = map(int, input().split())
    draw(x, y)

d = [(-1, 0), (1, 0), (0, -1), (0, 1)]
count = 0
for i in range(102):
    for j in range(102):
        if white[i][j] == 1:
            for k in range(len(d)):
                ny = i + d[k][1]
                nx = j + d[k][0]
                if nx < 0 or ny < 0 or nx >= 102 or ny >= 102:
                    continue
                if white[ny][nx] == 0:
                    count += 1
print(count)
