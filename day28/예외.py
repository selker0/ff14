def exam1():
    # 예외가 발생하면 except절로 이동해서 적절한 대응을 한다
    try:
      data = None
      result = int(data)
    except:
        print('숫자를 입력하세요')

def exam2():
    try:
       data = 'aaaaaaaa'
       result = int(data)
    except:
        print('숫자를 입력하세요')
        
def exam3():
    try:
        pageno = None
        pageno = int(pageno)
    except ValueError:
        print('벨류 에러')
    except TypeError:
        print('타입 에러')
    except:
        print('숫자를 입력하세요')
        
exam3()


def exam4():
    try:
      pageno = None
      pageno = int(pageno)
    except (TypeError, ValueError):
      print('숫자를 입력하세요')