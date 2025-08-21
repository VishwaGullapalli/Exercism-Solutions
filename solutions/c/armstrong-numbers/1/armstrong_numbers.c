#include "armstrong_numbers.h"

bool is_armstrong_number(int candidate) {
    int sum = 0,dupe = candidate;
    int count = number_of_digits(candidate);
    while (dupe != 0) {
        int temp = dupe % 10;
        sum = sum + pow(temp,count);
        dupe = dupe / 10;
    }
    if (dupe == candidate) {
        return true;
    }
    return false;
}

int number_of_digits(int candidate) {
    int count;
    while (candidate != 0) {
        candidate = candidate / 10;
        count++;
    }
    return count;
}