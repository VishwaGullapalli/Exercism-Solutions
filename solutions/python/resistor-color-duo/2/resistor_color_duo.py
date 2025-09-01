def value(colors):
    return color_index(colors[0]) * 10 + color_index(colors[1])

def color_index(color):
    color_codes = [
        "black", "brown", "red", "orange", "yellow",
        "green", "blue", "violet", "grey", "white"
    ]
    return color_codes.index(color)