def score(x, y):
    r2 = x*x + y*y
    return 10 if r2 <= 1 else 5 if r2 <= 25 else 1 if r2 <= 100 else 0
