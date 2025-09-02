def resistor_label(colors):
    color_digits = {
        'black': 0, 'brown': 1, 'red': 2, 'orange': 3, 'yellow': 4,
        'green': 5, 'blue': 6, 'violet': 7, 'grey': 8, 'white': 9
    }
    multipliers = {
        'black': 1, 'brown': 10, 'red': 100, 'orange': 1_000,
        'yellow': 10_000, 'green': 100_000, 'blue': 1_000_000,
        'violet': 10_000_000, 'grey': 100_000_000, 'white': 1_000_000_000,
        'gold': 0.1, 'silver': 0.01,
    }
    tolerances = {
        'grey': "±0.05%", 'violet': "±0.1%", 'blue': "±0.25%",
        'green': "±0.5%", 'brown': "±1%", 'red': "±2%",
        'gold': "±5%", 'silver': "±10%",
    }
    
    if len(colors) == 1 and colors[0] == "black":
        return "0 ohms"
    
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
    
    if value >= 1_000_000:
        if value % 1_000_000 == 0:
            value_str = f"{int(value // 1_000_000)} megaohms"
        else:
            mega_value = value / 1_000_000
            if mega_value == int(mega_value):
                value_str = f"{int(mega_value)} megaohms"
            else:
                value_str = f"{mega_value} megaohms"
    elif value >= 1_000:
        if value % 1_000 == 0:
            value_str = f"{int(value // 1_000)} kiloohms"
        else:
            kilo_value = value / 1_000
            if kilo_value == int(kilo_value):
                value_str = f"{int(kilo_value)} kiloohms"
            else:
                value_str = f"{kilo_value} kiloohms"
    else:
        if value == int(value):
            value_str = f"{int(value)} ohms"
        else:
            value_str = f"{value} ohms"
    
    return f"{value_str} {tolerance}"