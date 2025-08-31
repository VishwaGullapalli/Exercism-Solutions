def is_valid(isbn):
    isbn = isbn.replace("-", "")
    if len(isbn) != 10:
        return False
    total = 0
    for i in range(10):
        if i == 9 and isbn[i] == 'X':
            digit = 10
        elif isbn[i].isdigit():
            digit = int(isbn[i])
        else:
            return False
        total += digit * (10 - i)
    return total % 11 == 0
