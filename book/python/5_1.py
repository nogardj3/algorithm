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
    data.append(list(input()))


def print_data():
    print("--------")
    for i in range(n):
        print(data[i])


def dfs(graph, x, y):
    graph[x][y] = "1"
    print_data()
    # 상
    if x - 1 >= 0 and data[x - 1][y] == "0":
        dfs(graph, x - 1, y)
    # 하
    if x + 1 <= n - 1 and data[x + 1][y] == "0":
        dfs(graph, x + 1, y)
    # 좌
    if y - 1 >= 0 and data[x][y - 1] == "0":
        dfs(graph, x, y - 1)
    # 우
    if y + 1 <= m - 1 and data[x][y + 1] == "0":
        dfs(graph, x, y + 1)

    return


def bfs(data, x, y):
    dq = collections.deque()
    dq.append((x, y))
    data[x][y] = "1"

    while dq:
        temp = dq.popleft()
        print(temp)
        x = temp[0]
        y = temp[1]

        if x - 1 >= 0 and data[x - 1][y] == "0":
            data[x - 1][y] = "1"
            dq.append((x - 1, y))
        # 하
        if x + 1 <= n - 1 and data[x + 1][y] == "0":
            data[x + 1][y] = "1"
            dq.append((x + 1, y))
        # 좌
        if y - 1 >= 0 and data[x][y - 1] == "0":
            data[x][y - 1] = "1"
            dq.append((x, y - 1))
        # 우
        if y + 1 <= m - 1 and data[x][y + 1] == "0":
            data[x][y + 1] = "1"
            dq.append((x, y + 1))
        print_data()

    return


count = 0
for i in range(n):
    for j in range(m):
        if data[i][j] == "0":
            # sol1 - dfs
            # dfs(data, i, j)
            # sol2 - bfs
            print("----- start ------")
            bfs(data, i, j)
            count += 1


print(count)
