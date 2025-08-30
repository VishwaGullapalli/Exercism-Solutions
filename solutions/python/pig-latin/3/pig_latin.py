def translate(text):
    vowels = "aeiou"
    def pig(word):
        if word[0] in vowels or word.startswith(("xr", "yt")):
            return word + "ay"
        if word.startswith("qu"):
            return word[2:] + "quay"
        if (i := word.find("qu")) > 0 and all(c not in vowels for c in word[:i]):
            return word[i+2:] + word[:i+2] + "ay"
        for i, c in enumerate(word):
            if c in vowels or (c == "y" and i):
                return word[i:] + word[:i] + "ay"
    return " ".join(map(pig, text.split()))
