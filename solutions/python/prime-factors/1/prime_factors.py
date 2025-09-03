def factors(value):
    lst = []
    i = 2
    while i * i <= value:
        while value % i == 0:
            lst.append(i)
            value //= i
        i += 1
    if value > 1:
        lst.append(value)
    return lst


def checkPrime(value):
    for i in range(2, int(value / 2 + 1)):
        if value % i == 0:
            return False
    return True