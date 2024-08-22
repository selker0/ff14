import flask

app = flask.Flask(__name__)

# http://localhost:8081/squre?val=10 형식으로 요청이 들어온다
# 10을 출력하는 플라스크 코드와 html을 작성하시오
@app.route("/squre")
def squre():
    val = flask.request.args.get('val')
    if val!=None:
        val = int(val)
    return flask.render_template('squre.html', val=val)
    return flask.render_template('squre.html',message='val을 입력하세요')

app.run(debug=True, port=8081)