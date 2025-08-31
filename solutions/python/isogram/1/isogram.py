def is_isogram(string):
    clean = [letter.lower() for letter in string if letter.isalpha()]
    return len(clean) == len(set(clean))
