# 파이썬의 타입(자료형)
# - oracle의 타입 : 숫자, 문자열, 날짜
# - JS의 타입 : object(참조타입) vs 기본타입(number, boolean, string, undefined)

# 모든 타입은 객체로 표현
# 기본 타입 - 값을 하나 다룬다 : int, float, bool
# squence : str, list(일반 배열), tuple(읽기 전용 배열) - index 사용가능
# dicrionary : JS의 객체
# set : 값이 중복될 수 없다. 순서가 없다(인덱스 사용 불가)
#특수 타입 - None

a = '3'
x = int(a)

b = [1,2,3,1,2,3]
y = set(b)
print(y)

b2 = list(y)
print(b2)

print(b[0])