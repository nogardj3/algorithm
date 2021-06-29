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
x, y, n = input().split()

n = int(n)
# row, col 아닌 col, row인거 유의
king_pos = (ord(x[0]) - ord("A"), int(x[1]) - 1)
stone_pos = (ord(y[0]) - ord("A"), int(y[1]) - 1)

direction = [(1, 0), (-1, 0), (0, -1), (0, 1), (1, 1), (-1, 1), (1, -1), (-1, -1)]
direction_index = ["R", "L", "B", "T", "RT", "LT", "RB", "LB"]

for i in range(n):
    dd = direction_index.index(input())
    kx, ky = king_pos[0] + direction[dd][0], king_pos[1] + direction[dd][1]

    if kx < 0 or ky < 0 or kx > 7 or ky > 7:
        continue
    if kx == stone_pos[0] and ky == stone_pos[1]:
        tx, ty = stone_pos[0] + direction[dd][0], stone_pos[1] + direction[dd][1]
        if tx < 0 or ty < 0 or tx > 7 or ty > 7:
            continue
        stone_pos = (stone_pos[0] + direction[dd][0], stone_pos[1] + direction[dd][1])
    king_pos = (kx, ky)

print(f"{chr(king_pos[0] + ord('A'))}{int(king_pos[1]) + 1}")
print(f"{chr(stone_pos[0] + ord('A'))}{int(stone_pos[1]) + 1}")
