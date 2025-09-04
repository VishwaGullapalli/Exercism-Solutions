def abbreviate(words):
    words = words.replace("-", " ").replace("_", " ")
    solution = ""
    for word in words.split(" "):
        if word and word[0].isalpha():
            solution = solution + word[0].upper()
    return solution
