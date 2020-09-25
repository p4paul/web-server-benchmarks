from flask import Flask
from flask import send_file

app = Flask(__name__)

@app.route('/fib/<int:number>')
def index(number=1):
    return "___Python+Flask: fib("+ str(number) + ") = " + str(fib(number))

@app.route('/file')
def send_jar():
    try:
        return send_file('../sample/commons-lang-2.6.jar', attachment_filename='python.jpg')
    except Exception as e:
        return str(e)

def fib(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fib(n-1) + fib(n-2)

if __name__ == '__main__':
    app.run(debug=False)