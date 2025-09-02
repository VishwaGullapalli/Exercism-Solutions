def label(colors):
    COLOR_CODES = {
        "black": 0, "brown": 1, "red": 2, "orange": 3, "yellow": 4,
        "green": 5, "blue": 6, "violet": 7, "grey": 8, "white": 9
    }
    UNITS = [
        ("gigaohms", 1_000_000_000),
        ("megaohms", 1_000_000),
        ("kiloohms", 1_000),
        ("ohms", 1)
    ]
    digits = [COLOR_CODES[c] for c in colors[:3]]
    resistance = (digits[0] * 10 + digits[1]) * 10 ** digits[2]
    for unit, value in UNITS:
        if resistance >= value:
            result = f"{resistance // value} {unit}"
            break
    else:
        result = "0 ohms"
    return result
