import re

def abbreviate(words):
    words = re.sub(r"'", '', words)
    return ''.join(w[0].upper() for w in re.findall(r'[A-Za-z]+', words))
