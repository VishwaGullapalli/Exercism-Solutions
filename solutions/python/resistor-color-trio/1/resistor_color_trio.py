def label(colors):
    color_codes = {
        "black": 0,
        "brown": 1,
        "red": 2,
        "orange": 3,
        "yellow": 4,
        "green": 5,
        "blue": 6,
        "violet": 7,
        "grey": 8,
        "white": 9
    }
    first_digit = color_codes[colors[0]]
    second_digit = color_codes[colors[1]]
    multiplier = color_codes[colors[2]]
    value = int(str(first_digit) + str(second_digit)) * (10 ** multiplier)
    
    if value >= 1_000_000_000:
        label_value = value // 1_000_000_000
        label_str = f"{label_value} gigaohms"
    elif value >= 1_000_000:
        label_value = value // 1_000_000
        label_str = f"{label_value} megaohms"
    elif value >= 1_000:
        label_value = value // 1_000
        label_str = f"{label_value} kiloohms"
    else:
        label_str = f"{value} ohms"
    return label_str
