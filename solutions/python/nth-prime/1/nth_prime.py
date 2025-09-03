def prime(number):
    if number <= 0:
        raise ValueError('there is no zeroth prime')
    count = 0
    nbr = 2
    while count != number:
        if checkPrime(nbr):
            count += 1
        nbr += 1
    return nbr - 1

def checkPrime(value):
    for number in range(2, int(value / 2) + 1):
        if value % number == 0:
            return False
    return True