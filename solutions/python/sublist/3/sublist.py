"""
This exercise stub and the test suite contain several enumerated constants.

Enumerated constants can be done with a NAME assigned to an arbitrary,
but unique value. An integer is traditionally used because it’s memory
efficient.
It is a common practice to export both constants and functions that work with
those constants (ex. the constants in the os, subprocess and re modules).

You can learn more here: https://en.wikipedia.org/wiki/Enumerated_type
"""

# Possible sublist categories.
# Change the values as you see fit.
SUBLIST = 'sublist'
SUPERLIST = 'superlist'
EQUAL = 'equal'
UNEQUAL = 'unequal'

def sublist(a, b):
    if a == b: return EQUAL
    if any(a == b[i:i+len(a)] for i in range(len(b) - len(a) + 1)): return SUBLIST
    if any(b == a[i:i+len(b)] for i in range(len(a) - len(b) + 1)): return SUPERLIST
    return UNEQUAL
