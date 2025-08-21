#include "resistor_color.h"

int resistor_color_code(resistor_band_t);

int resistor_color_code(resistor_band_t band) {
    return band;
}

int resistor_colors();

int resistor_colors() {
    static resistor_band_t values[10];
    for (int i = 0; i < 10; i++) {
        values[i] = i;
    }
    return values;
}