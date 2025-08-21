#include "armstrong_numbers.h"
#include <math.h>

int number_of_digits(int number);

bool is_armstrong_number(int candidate) {
    int sum = 0,dupe = candidate;
    int count = number_of_digits(candidate);
    while (candidate) {
        int temp = candidate % 10;
        sum = sum + pow(temp,count);
        candidate = candidate / 10;
    }
    if (sum == dupe) {
        return true;
    } else {
        return false;
    }
}

int number_of_digits(int number) {
    int count = 0;
    while (number != 0) {
        number = number / 10;
        count++;
    }
    return count;
}