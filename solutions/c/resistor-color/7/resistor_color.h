#ifndef RESISTOR_COLOR_H
#define RESISTOR_COLOR_H

typedef enum {
    Black = 0,
    Brown = 1,
    Red = 2,
    Orange = 3,
    Yellow = 4,
    Green = 5,
    Blue = 6,
    Violet = 7,
    Grey = 8,
    White = 9
} resistor_band_t;

int resistor_color_code(resistor_band_t band);

resistor_band_t *resistor_colors();

#endif
