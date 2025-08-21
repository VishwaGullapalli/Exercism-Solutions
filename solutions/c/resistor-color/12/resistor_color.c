#include "resistor_color.h"

int color_code(resistor_band_t band) {
    return band;
}

resistor_band_t *colors() {
    static resistor_band_t values[10];
    for (resistor_band_t i = BLACK; i <= WHITE; i++) {
        values[i] = i;
    }
    return values;
}