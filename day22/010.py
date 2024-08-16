# 액셀 파일 open > 최소화 > 아까 열었던 파일 다시 더블클릭(lock)

# 시퀸스 스타일
# 배열-리스트 : 자료의 집합 + CRUD
# tuple : 읽기 전용 자료 집함

lst = [1,3,5,6,7]
tpl = (1,3,5)
tpl2 = 1,3,5

lst2 = [1]
print(type(lst2))
tpl3 = 1,
print(type(tpl3))

print(lst[-1])
print(tpl[-1])

# 리스트 마지막에 원소를 추가
my_list = []
my_list.append(3)
my_list.append(4)
print(my_list)

# 원하는 위치에 원소를 추가
my_list.insert(1,10)
print(my_list)

# 리스트에서 원소를 제거 : del 연산자
del my_list[1]
print(my_list)
del(my_list[1])
print(my_list)

a = 10
del a
#print(a)

# 리스트의 모든 원소 삭제
my_list.clear()

# join 메소드
my_str = 'hello-안녕하세요-도모'
str_list = my_str.split('-')
print(str_list)

# 문자열들의 리스트를 모아서 단일 문자열로
my_str2 = ' '.join(str_list)
print(my_str2)

# 리스트와 튜플의 변경
x = ['A','B','C']
y = 'A','B','C'
z = 'ABC'

x[0]='a'
print(x)
# str은 인덱스로 값을 변경할 수 없다
z[0]='a'