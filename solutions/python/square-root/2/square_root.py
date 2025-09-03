def square_root(number):
    for i in range(int(number + 1 / 2) + 1):
        if i * i == number:
            return i
