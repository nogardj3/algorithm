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

n, m = map(int, input().split())

data = []

for i in range(n):
    data.append(list(map(int, input())))


def print_data():
    print("--------")
    for i in range(n):
        print(data[i])


def dfs(count, x, y):
    data[x][y] = count

    if x == n - 1 and y == m - 1:
        return True

    print_data()
    # 우
    res = False
    if y + 1 <= m - 1 and data[x][y + 1] == 1 and not res:
        res = dfs(count + 1, x, y + 1)
    # 하
    if x + 1 <= n - 1 and data[x + 1][y] == 1 and not res:
        res = dfs(count + 1, x + 1, y)
    # 상
    if x - 1 >= 0 and data[x - 1][y] == 1 and not res:
        res = dfs(count + 1, x - 1, y)
    # 좌
    if y - 1 >= 0 and data[x][y - 1] == 1 and not res:
        res = dfs(count + 1, x, y - 1)

    return False


def bfs(count, x, y):
    dq = collections.deque()
    dq.append((x, y))
    data[x][y] = count

    while dq:
        temp = dq.popleft()
        print(temp)
        x = temp[0]
        y = temp[1]
        # count += 1

        # 우
        if y + 1 <= m - 1 and data[x][y + 1] == 1:
            data[x][y + 1] = data[x][y] + 1
            dq.append((x, y + 1))
        # 하
        if x + 1 <= n - 1 and data[x + 1][y] == 1:
            data[x + 1][y] = data[x][y] + 1
            dq.append((x + 1, y))
        # 상
        if x - 1 >= 0 and data[x - 1][y] == 1:
            data[x - 1][y] = data[x][y] + 1
            dq.append((x - 1, y))
        # 좌
        if y - 1 >= 0 and data[x][y - 1] == 1:
            data[x][y - 1] = data[x][y] + 1
            dq.append((x, y - 1))
        print_data()

    return


count = 0
posx, posy = 0, 0

# sol1
# dfs(1, 0, 0)
# sol2
bfs(1, 0, 0)

print(data[n - 1][m - 1])
