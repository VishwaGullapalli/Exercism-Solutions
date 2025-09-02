def resistor_label(colors):
    if colors == ["black"]: return "0 ohms"
    color_digits = {'black':0, 'brown':1, 'red':2, 'orange':3, 'yellow':4, 'green':5, 'blue':6, 'violet':7, 'grey':8, 'white':9}
    multipliers = {'black':1, 'brown':10, 'red':100, 'orange':1000, 'yellow':10000, 'green':100000, 'blue':1000000, 'violet':10000000, 'grey':100000000, 'white':1000000000, 'gold':0.1, 'silver':0.01}
    tolerances = {'grey':"±0.05%", 'violet':"±0.1%", 'blue':"±0.25%", 'green':"±0.5%", 'brown':"±1%", 'red':"±2%", 'gold':"±5%", 'silver':"±10%"}
    def format_value(value):
        if value >= 1_000_000: return f"{value/1_000_000:g} megaohms"
        if value >= 1_000: return f"{value/1_000:g} kiloohms"
        return f"{int(value)} ohms"
    if len(colors) == 4:
        value = (color_digits[colors[0]]*10 + color_digits[colors[1]])*multipliers[colors[2]]
        return f"{format_value(value)} {tolerances[colors[3]]}"
    if len(colors) == 5:
        value = (color_digits[colors[0]]*100 + color_digits[colors[1]]*10 + color_digits[colors[2]])*multipliers[colors[3]]
        return f"{format_value(value)} {tolerances[colors[4]]}"
    return "Invalid input"
