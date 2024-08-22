import flask

app = flask.Flask(__name__)

# annotation : 어노테이션
# /insa로 요청이 들어오면 aaa()함수를 실행해라
# 어떻게 실행하지? 몰라. 관심없어
# @app.route("/insa")
# def aaa():
#    return flask.render_template('insa.html', name='nn')

# :8081/list?pageno=10
@app.route("/")
def bbb():
    # get방식 요청의 querystring에 접근
    # js : location.search > 플라스크는 flask.request.args 딕셔너리
    # flask.request.args['pageno'] > pageno가 없을 경우 오류가 발생
    pageno = flask.request.args.get('pageno')
    if pageno==None:
        return flask.render_template('list.html', message='pageno를 입력하세요')
    return flask.render_template('list.html', pageno=pageno)

app.run(debug=True, port=8081)