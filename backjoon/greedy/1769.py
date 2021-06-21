import itertools
import heapq
import bisect
import collections
import math
import sys

n = input()

count = 0
while (len(n) != 1):
    sum = 0
    for i in range(len(n)):
        sum += int(n[i])
    n = str(sum)
    count += 1

print(count)
print('YES' if (int(n) % 3 == 0 and int(n) != 0) else 'NO')