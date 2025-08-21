#include "resistor_color.h"

int resistor_color_code(resistor_band_t band) {
    return band;
}

resistor_band_t resistor_colors() {
    static resistor_band_t values[10];
    for (int i = 0; i < 10; i++) {
        values[i] = i;
    }
    return values;
}