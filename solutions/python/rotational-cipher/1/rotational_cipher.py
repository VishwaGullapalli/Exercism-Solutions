def rotate(text, key):
    result = ''
    for letter in text:
        uni = ord(letter)
        if 'a' <= letter <= 'z':
            result += chr((uni - ord('a') + key) % 26 + ord('a'))
        elif 'A' <= letter <= 'Z':
            result += chr((uni - ord('A') + key) % 26 + ord('A'))
        else:
            result += letter
    return result