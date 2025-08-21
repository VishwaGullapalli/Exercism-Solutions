#include "resistor_color.h"

int resistor_color_code(resistor_band_t band);

resistor_band_t *bands();

int resistor_color_code(resistor_band_t band) {
    return band;
}

resistor_band_t *bands() {
    static resistor_band_t values[10];
    for (resistor_band_t i = BLACK; i < WHITE; i++) {
        values[i] = i;
    }
    return values;
}