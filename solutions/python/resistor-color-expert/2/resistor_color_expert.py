def get_color_digits():
    return {
        'black': 0, 'brown': 1, 'red': 2, 'orange': 3, 'yellow': 4,
        'green': 5, 'blue': 6, 'violet': 7, 'grey': 8, 'white': 9
    }

def get_multipliers():
    return {
        'black': 1, 'brown': 10, 'red': 100, 'orange': 1_000,
        'yellow': 10_000, 'green': 100_000, 'blue': 1_000_000,
        'violet': 10_000_000, 'grey': 100_000_000, 'white': 1_000_000_000,
        'gold': 0.1, 'silver': 0.01,
    }

def get_tolerances():
    return {
        'grey': "±0.05%", 'violet': "±0.1%", 'blue': "±0.25%",
        'green': "±0.5%", 'brown': "±1%", 'red': "±2%",
        'gold': "±5%", 'silver': "±10%",
    }

def format_value(value):
    if value >= 1_000_000:
        return f"{value/1_000_000:g} megaohms" if value % 1_000_000 else f"{int(value // 1_000_000)} megaohms"
    if value >= 1_000:
        return f"{value/1_000:g} kiloohms" if value % 1_000 else f"{int(value // 1_000)} kiloohms"
    return f"{int(value)} ohms"

def resistor_label(colors):
    if len(colors) == 1 and colors[0] == "black":
        return "0 ohms"
    color_digits = get_color_digits()
    multipliers = get_multipliers()
    tolerances = get_tolerances()
    if len(colors) == 4:
        d1 = color_digits[colors[0]]
        d2 = color_digits[colors[1]]
        multiplier = multipliers[colors[2]]
        tolerance = tolerances[colors[3]]
        value = (d1 * 10 + d2) * multiplier
    elif len(colors) == 5:
        d1 = color_digits[colors[0]]
        d2 = color_digits[colors[1]]
        d3 = color_digits[colors[2]]
        multiplier = multipliers[colors[3]]
        tolerance = tolerances[colors[4]]
        value = (d1 * 100 + d2 * 10 + d3) * multiplier
    else:
        return "Invalid input"
    return f"{format_value(value)} {tolerance}"
