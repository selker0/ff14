# http://localhost:8081/example04?val=10 형식으로 요청이 들어온다
# 제곱값을 출력하는 플라스크 코드와 html을 작성하시오
# val이 None인 경우 alert을 이용해서 오류 메세지를 출력
# 제곱값이 100이상인 경우 빨간색, 미만인 경우 파란색으로 출력하시오

import flask

app = flask.Flask(__name__)

@app.route('/example04', methods=['GET'])
def example04() :
    # get방식 : args, post방식 : form
 val = flask.request.args.get('val')
 if val==None:
     return flask.render_template('example04.html', message='val을 입력하세요')
 else:
     val = int(val)
     square = val*val
     return flask.render_template('example04.html', val=val, square=square)
    


app.run(debug=True,port=8081)

# /example05?radius =얼마
# radius가 전달되지 않았다면 alret()으로 오류 메시지 출력
# 반지름이 100이상이라면 빨강, 아니면 파란색으로 출력