#include "resistor_color.h"

int color_code(resistor_band_t band) {
    return band;
}

resistor_band_t *colors() {
    static resistor_band_t values[10];
    for (resistor_band_t i = 0; i < 10; i++) {
        values[i] = i;
    }
    return values;
}