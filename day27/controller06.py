# 사용자 요청을 접수해 응답을 출력하는 기능
# 숫자 1개 입력 받아 제곱해서 출력하기
# 입력화면 : exam05_input.html
# 출력화면 : exam05_trsult.html
from flask import request, render_template, Flask

app = Flask(__name__)

# SSR 방식에서 GET 요청은 읽기 요청 or 작업화면을 보여주세요
@app.route("/exam06", methods=['GET'])
def start():
    return render_template('exam06_input.html')

# SSR 방식에서 POST 요청은 처리해서 결과 출력
@app.route("/exam06", methods=['POST'])
def end():
    val = request.form.get('val')
    if val !=None:
        val = int(val)
        result = val*val
        return render_template('exam06_result.html', result=result)
    return render_template('exam06_result.html', message = '숫자를 입력하세요')

app.run(debug=True, port=8081)