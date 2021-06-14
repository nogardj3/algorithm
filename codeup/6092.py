import itertools
import heapq
import bisect
import collections
import math
import sys

"""
# 단순 공백 기준 여러개 받기
n, m = map(int, input().split())

# n * m 2차원 배열 받기
n, m = int(input())
for i in range(n):
    data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""

n = int(input())  # 개수를 입력받아 n에 정수로 저장
a = list(map(int, input().split()))  # 공백을 기준으로 잘라 a에 순서대로 저장

# for i in range(n):  # 0부터 n-1까지...
#     a[i] = int(a[i])  # a에 순서대로 저장되어있는 각 값을 정수로 변환해 다시 저장

d = []  # d라는 이름의 빈 리스트 [ ] 변수를 만듦. 대괄호 기호 [  ] 를 사용한다.
for i in range(24):  # [0, 0, 0, ... , 0, 0, 0] 과 같이 24개의 정수 값 0을 추가해 넣음
    d.append(0)  # 각 값은 d[0], d[1], d[2], ... , d[22], d[23] 으로 값을 읽고 저장할 수 있음.

for i in range(n):  # 번호를 부를 때마다, 그 번호에 대한 카운트 1씩 증가
    d[a[i]] += 1

for i in range(1, 24):  # 카운트한 값을 공백을 두고 출력
    print(d[i], end=" ")