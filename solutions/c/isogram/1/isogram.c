#include "isogram.h"

#include <stdio.h>
#include <ctype.h>

bool is_isogram(const char phrase[]);

bool is_isogram(const char phrase[]) {
    if (!phrase) {
        return false;
    }
    for (int i = 0; phrase[i] != '\0'; i++) {
        if(isalpha(tolower(phrase[i]))) {
            for (int j = i+1; phrase[j] != '\0'; j++) {
                if ((tolower(phrase[i])) == (tolower(phrase[j]))) {
                    return false;
                }
            }
        }
    }
    return true;
}