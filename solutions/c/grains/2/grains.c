#include "grains.h"

uint64_t square(uint8_t index);

uint64_t total(void);

uint64_t square(uint8_t index) {
    if (index >= 1 && index <= 64) {
        return pow(2,index - 1);
    }
    return 0;
}

uint64_t total(void) {
    uint64_t sum = 0;
    for (int i = 0; i < 64; i++) {
        sum = sum + (uint64_t)pow(2,i-1);
    }
    return sum;
}