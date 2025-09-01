def value(colors):
    color_codes = [
        "black", "brown", "red", "orange", "yellow",
        "green", "blue", "violet", "grey", "white"
    ]
    num = [str(color_codes.index(color)) for color in colors[:2]]
    return int("".join(num))