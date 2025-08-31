def score(x, y):
    radius_sq = x * x + y * y
    if radius_sq <= 1:
        return 10
    if radius_sq <= 25:
        return 5
    if radius_sq <= 100:
        return 1
    return 0
