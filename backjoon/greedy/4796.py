import itertools
import heapq
import bisect
import collections
import math
import sys

def print_arr(arr):
    print()
    for i in range(len(arr)):
        print(arr[i])

def check_is_same():
    global origin_arr,res_arr
    
    for i in range(len(origin_arr)):
        for j in range(len(origin_arr[i])):
            if (origin_arr[i][j] != res_arr[i][j]):
                return False
    return True

n, m = map(int, input().split())

origin_arr = [list(map(int, list(input()))) for _ in range(n)]
res_arr = [list(map(int, list(input()))) for _ in range(n)]

count = 0
for i in range(n - 2):
    for j in range(m -2):
        if (origin_arr[i][j] != res_arr[i][j]):
            for z in range(i,i+3):
                for x in range(j, j + 3):
                    origin_arr[z][x] = 1 - origin_arr[z][x]
            # print_arr(res_arr)
            count += 1

print(count if origin_arr == res_arr else -1)