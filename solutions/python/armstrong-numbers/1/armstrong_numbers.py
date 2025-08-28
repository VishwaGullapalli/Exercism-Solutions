def is_armstrong_number(number):
    digits = str(number)
    n = len(digits)
    total = sum(int(digit) ** n for digit in digits)
    return total == number