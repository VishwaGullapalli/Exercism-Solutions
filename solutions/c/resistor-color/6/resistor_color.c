#include "resistor_color.h"

int resistor_color_code(resistor_band_t band) {
    return band;
}

resistor_band_t *resistor_colors() {
    static resistor_band_t values[10];
    for (resistor_band_t i = Black; i < White; i++) {
        values[i] = i;
    }
    return values;
}