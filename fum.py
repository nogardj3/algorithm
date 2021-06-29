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

# tuple의 값 따라 정렬
data.sort(key=lambda x: (x[1], x[0]))

# list 순서 뒤집기
arr.reverse()

# list 역순 정렬 (desc)
arr.sort(reverse= True)

# 2차원 list 한줄 선언
data = [[0 for col in range(n)] for row in range(n)]

# string find
str.find('aa')  # 없으면 -1
str.index('aa') # 없으면 에러

# 리스트 원소별 출력
res = [1,2,3]
print(*res)

# 변수 출력
print(f"count : {count}}")


# 아스키코드
ord('A')   # 한 문자를 아스키 코드로
chr(65)    # 아스키코드를 문자로

"""
