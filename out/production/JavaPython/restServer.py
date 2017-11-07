from flask import Flask
from flask import request

app = Flask(__name__)

@app.route('/')
def home():
    return '<h1>Hello World!</h1>'

@app.route('/merge', methods=['POST', 'GET'])
def mergeString():
	if request.method == 'POST':
		return request.form['username'] + request.form['password'];
	if request.method == 'GET':
		return 'mege result is yugangqiang';


@app.route('/split', methods=['GET'])
def split():
	if request.method == 'GET':
		return request.args['username'] + "split";



if __name__ == '__main__':
    app.run()