def translate(text):
    vowels = "aeiou"
    result = []
    for word in text.split():
        if word[0] in vowels or word.startswith(("xr", "yt")):
            result.append(word + "ay")
        elif word.startswith("qu"):
            result.append(word[2:] + "quay")
        elif (idx := word.find("qu")) > 0 and all(c not in vowels for c in word[:idx]):
            result.append(word[idx+2:] + word[:idx+2] + "ay")
        else:
            for i, c in enumerate(word):
                if c in vowels or (c == "y" and i):
                    result.append(word[i:] + word[:i] + "ay")
                    break
    return " ".join(result)
