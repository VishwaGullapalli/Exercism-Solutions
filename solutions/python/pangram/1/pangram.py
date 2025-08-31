def is_pangram(sentence):
    total = set('abcdefghijklmnopqrstuvwxyz')
    return total <= set(sentence.lower())
