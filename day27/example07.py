# 점수를 입력받아 70점 이상이면 파랑색 합격, 미만이면 빨강 불합격
# 점수를 입력하지 않았으면 alret으로 에러메세지

# 점수입력뷰, 결과출력뷰, 파이썬 코드를 작성해 실행하시오

from flask import request, render_template, Flask

app = Flask(__name__)

@app.route("/exam07", methods=['GET'])
def go():
    return render_template('exam07go.html')

@app.route("/exam07", methods=['POST'])
def pas():
    val = request.form.get('val')
    if val != None:
        val = int(val)
        result = val
        return render_template('exam07pas.html', result=result)
    return render_template('exam07pas.html', message="점수를 입력하시오")

app.run(debug=True, port=8081)