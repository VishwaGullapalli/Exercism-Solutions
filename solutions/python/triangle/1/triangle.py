def equilateral(sides):
    if not check(sides):
        return False
    if sides[0] == sides[1] and sides[1] == sides[2]:
        return True
    return False

def isosceles(sides):
    if not check(sides):
        return False
    if sides[0] == sides[1] or sides[1] == sides[2] or sides[0] == sides[2]:
        return True
    return False


def scalene(sides):
    if not check(sides):
        return False
    if sides[0] == sides[1] or sides[1] == sides[2] or sides[0] == sides[2]:
        return False
    return True

def check(sides):
    a = sides[0]
    b = sides[1]
    c = sides[2]
    if a <= 0 or b <= 0 or c<= 0:
        return False
    if a + b < c:
        return False
    if c + b < a:
        return False
    if a + c < b:
        return False
    return True