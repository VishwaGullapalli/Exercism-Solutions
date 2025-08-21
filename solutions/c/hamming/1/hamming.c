#include "hamming.h"

#include <string.h>

int compute(const char *lhs, const char *rhs);

int compute(const char *lhs, const char *rhs) {
    int h_distance = 0, i;
    for (i = 0; lhs[i]; i++) {
        if (lhs[i] != rhs[i]) {
            h_distance++;
        }
    }
    if (rhs[i]) {
        return -1;
    }
    return h_distance;
}