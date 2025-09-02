def label(colors):
    color_codes = {
        "black": 0, "brown": 1, "red": 2, "orange": 3, "yellow": 4,
        "green": 5, "blue": 6, "violet": 7, "grey": 8, "white": 9
    }
    # Use only first three valid colors
    c0, c1, c2 = (colors + ['black', 'black', 'black'])[:3]
    value = color_codes[c0] * 10 + color_codes[c1]
    ohm_value = value * (10 ** color_codes[c2])

    units = [
        ("gigaohms", 1_000_000_000),
        ("megaohms", 1_000_000),
        ("kiloohms", 1_000),
        ("ohms", 1)
    ]

    for name, factor in units:
        if ohm_value >= factor:
            n = ohm_value // factor
            return f"{n} {name}"
    return "0 ohms"
