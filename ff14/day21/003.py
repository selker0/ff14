#두 숫자를 저장한 변수를 만들고 합게를 출력하시오
a = 10
b = 20
result = 30
print('합계:', result)

# +연산자의 양향 중에 하나라도 문자열이면 나머지도 문자열로 바꿔서 연결한다
# print('합계:'+ result)   #오류

print('합계:' + str(result))

#f문자열
print(f'합계:{result}')

name = input('이름입력:')
print(type(name))