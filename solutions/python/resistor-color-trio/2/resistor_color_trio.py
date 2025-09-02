def label(colors):
    color_codes = [
        "black", "brown", "red", "orange", "yellow",
        "green", "blue", "violet", "grey", "white"
    ]
    value = color_codes.index(colors[0]) * 10 + color_codes.index(colors[1])
    multiplier = 10 ** color_codes.index(colors[2])
    ohm_value = value * multiplier

    units = [("gigaohms", 1_000_000_000), ("megaohms", 1_000_000), ("kiloohms", 1_000), ("ohms", 1)]
    for name, factor in units:
        if ohm_value >= factor:
            n = ohm_value // factor
            return f"{n} {name}"
    return "0 ohms"
