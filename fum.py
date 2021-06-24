import itertools
import heapq
import bisect
import collections
import math
import sys

# Frequently Used Methods

"""
# string 길이
len(string) 

# binary string 1세기
bin(n).count('1')

# string 뒤집기
str[::-1]

# list의 tuple로 받기
for i in range(n):
    data.append(tuple(map(int, input().split())))

# tuple의 값 따라 정렬
data.sort(key=lambda x: (x[1], x[0]))

# list 역순 만들기
arr.reverse()

# list 역순 정렬
arr.sort(reverse= True)

# 2d list 받기
origin_arr = [list(map(int, list(input()))) for _ in range(n)]

# deque
deqq = collections.deque()
deqq.appendleft()
deqq.append()
deqq.popleft()
deqq.pop()

# string find
str.find('aa')  # 없으면 -1
str.index('aa') # 없으면 에러

# 리스트 띄워서 출력
res = [1,2,3]
print(*res)

# 2차원 배열 한줄 선언
data = [[0 for col in range(n)] for row in range(n)]

# 아스키코드
ord('A')   # 한 문자를 아스키 코드로
chr(65)    # 아스키코드를 문자로

"""
