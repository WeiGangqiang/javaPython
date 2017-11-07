import requests


def mergeGet(username, password):
    payload = {'username': username, 'password': password};
    res = requests.get("http://127.0.0.1:5000/merge", params = payload)
    return res.text

def mergePost(username, password):
    payload = {'username': username, 'password': password};
    res = requests.post("http://127.0.0.1:5000/merge", data = payload)
    return res.text


