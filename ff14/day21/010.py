#성적을 입력받아 90점이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 아니면 F

t = int(input('성적을 입력하시오'))
if t>=90:
    print('A')
elif t>=80:
    print('B')
elif t>=70:
    print('C')
elif t>=60:
    print('D')
else:
    print('F')

#국어와 영어 성적을 입력받아 모두 70점 이상이면 합격, 아니면 불합격

a = int(input('국어 성적'))
b = int(input('영어 성적'))

if a>=70&b>=70:
    print('합격')
else:
    print('불합격')
    
#국어와 영어 성적을 입력받아 모두 70점 이상이면 우수, 하나라도 70점 이상이라면 합격, 아니면 불합격

g = int(input('국어 성적'))
e = int(input('영어 성적'))

if g>=70&e>=70:
    print('우수')
elif g>=70 or e>=70:
    print('합격')
else:
    print('불합격')