def is_prime(n):
    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(n ** 0.5) + 1, 2):
        if n % i == 0:
            return False
    return True

def prime(number):
    if number <= 0:
        raise ValueError('there is no zeroth prime')
    count = 0
    current = 2
    while True:
        if is_prime(current):
            count += 1
            if count == number:
                return current
        current += 1
