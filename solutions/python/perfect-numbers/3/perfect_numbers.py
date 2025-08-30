def classify(number):
    """ A perfect number equals the sum of its positive divisors.

    :param number: int a positive integer
    :return: str the classification of the input integer
    """
    if number <= 0:
        raise ValueError("Classification is only possible for positive integers.")
    sum = 1 if number > 1 else 0
    i = 2
    while i * i <= number:
        if number % i == 0:
            sum += i
            if i != number // i:
                sum += number // i
        i += 1
    if sum == number:
        return "perfect"
    if sum < number:
        return "deficient"
    return "abundant"