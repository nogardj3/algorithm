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

n, k = map(int, input().split())

belt = collections.deque(map(int, input().split()))
robot = collections.deque([0] * 2 * n)

seq = 1
while True:
    # 로봇 한칸 회전, 내리기
    belt.rotate(1)
    robot.rotate(1)
    robot[n - 1] = 0

    # 로봇 이동, 내리기
    for i in range(n - 2, -1, -1):
        if robot[i] != 0 and robot[i + 1] == 0 and belt[i + 1] > 0:
            belt[i + 1] -= 1
            robot[i + 1], robot[i] = robot[i], 0
    robot[n - 1] = 0

    # 로봇 올리기
    if robot[0] == 0 and belt[0] > 0:
        robot[0] = 1
        belt[0] -= 1

    # 내구도 확인, 종료체크
    count = 0
    for i in range(len(belt)):
        if belt[i] < 1:
            count += 1
    # time.sleep(0.2)
    # print(count)
    # print(belt)
    # print(robot)
    if count >= k:
        print(seq)
        break

    seq += 1
