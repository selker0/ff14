# /example05?radius =얼마
# radius가 전달되지 않았다면 alret()으로 오류 메시지 출력
# 반지름이 100이상이라면 빨강, 아니면 파란색으로 출력

from flask import Flask, request, render_template
from math import pi

app=Flask(__name__)

@app.route("/example05")
def example05() :
    radius = request.args.get('radius')
    if radius!= None:
        radius = float(radius)
        area = pi * radius * radius
        return render_template('example05.html', radius=radius, area=area)
    return render_template('exampl05.html', message="반지름을 입력하세요")
    
app.run(debug=True, port=8081)

