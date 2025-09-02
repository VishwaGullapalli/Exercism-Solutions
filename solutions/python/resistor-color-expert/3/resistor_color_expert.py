def resistor_label(colors):
    digits = {'black': 0, 'brown': 1, 'red': 2, 'orange': 3, 'yellow': 4,
              'green': 5, 'blue': 6, 'violet': 7, 'grey': 8, 'white': 9}
    mult = {'black': 1, 'brown': 10, 'red': 100, 'orange': 1_000, 'yellow': 10_000,
            'green': 100_000, 'blue': 1_000_000, 'violet': 10_000_000,
            'grey': 100_000_000, 'white': 1_000_000_000, 'gold': 0.1, 'silver': 0.01}
    tol = {'grey': "±0.05%", 'violet': "±0.1%", 'blue': "±0.25%", 'green': "±0.5%",
           'brown': "±1%", 'red': "±2%", 'gold': "±5%", 'silver': "±10%"}

    def fmt(val):
        if val >= 1_000_000: return f"{val/1_000_000:g} megaohms"
        if val >= 1_000: return f"{val/1_000:g} kiloohms"
        return f"{int(val)} ohms"

    if colors == ["black"]:
        return "0 ohms"
    if len(colors) == 4:
        n = digits[colors[0]] * 10 + digits[colors[1]]
        value = n * mult[colors[2]]
        return f"{fmt(value)} {tol[colors[3]]}"
    if len(colors) == 5:
        n = digits[colors[0]] * 100 + digits[colors[1]] * 10 + digits[colors[2]]
        value = n * mult[colors[3]]
        return f"{fmt(value)} {tol[colors[4]]}"
    return "Invalid input"
