def translate(text):
    vowels = "aeiou"
    words = text.split()
    result = []
    for word in words:
        if word[0] in vowels or word.startswith("xr") or word.startswith("yt"):
            result.append(word + "ay")
            continue
        if word.startswith("qu"):
            result.append(word[2:] + "quay")
            continue
        idx = word.find("qu")
        if idx > 0 and all(c not in vowels for c in word[:idx]):
            result.append(word[idx+2:] + word[:idx+2] + "ay")
            continue
        for i, c in enumerate(word):
            if c in vowels or (c == "y" and i != 0):
                result.append(word[i:] + word[:i] + "ay")
                break
    return " ".join(result)
