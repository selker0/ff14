from flask import Flask, redirect, render_template, request

app = Flask(__name__)

# 루트 페이지
@app.route("/")
def root():
    return render_template("index.html")

# 제곱
@app.route("/square", methods=['GET'])
def square_get():
    return render_template('square_start.html')

@app.route("/square", methods=["POST"])
def square_post():
    try:
      val = int(request.form.get('val'))
      result = val * val
      # 작업결과를 html로 출력 > 주소 유지
      return render_template("square_end.html", result=result)
    except (TypeError, ValueError):
        # 새로운 작업으로 이동 > 주소가 변경
        return redirect("/", message="숫자를 입력하세요")

app.run(debug=True, port=8081)