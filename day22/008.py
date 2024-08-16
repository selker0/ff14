# 인덱싱
a = 'hello python'

print(a[0]) #h
print(a[1]) #e

print(a[11]) #n

# 함수는 실행이 끝나면 값
print(a[len(a)-1])
print(a[-1]) #n

# 문자열 슬라이싱
print(a[0:5])
print(a[1::2])

year = "2019/03/18"
# 03월
print(year[5:7]+'월')
