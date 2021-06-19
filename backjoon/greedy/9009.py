import itertools
import heapq
import bisect
import collections
import math
import sys
import time

"""
# 단순 공백 기준 여러개 받기
n, m = map(int, input().split())

# n * m 2차원 배열 받기
n= int(input())
for i in range(n):
    data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
t = int(input())

for i in range(t):
    n = int(input())
    
    num1 = 0
    num2 = 1

    data = []
    while (n != 0):
        new_val = num1 + num2
        if (new_val > n):
            n -= num2
            data.append(num2)
            num1 = 0
            num2 = 1
        elif (new_val == n):
            data.append(new_val)
            break
        else : 
            num1 = num2
            num2 = new_val
        # print(new_val,n)
        # time.sleep(0.1)

    for i in range( len(data) -1,-1,-1):
        print(data[i], end=" ")
    print()