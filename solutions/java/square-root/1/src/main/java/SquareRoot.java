public class SquareRoot {
    public int squareRoot(int radicand) {
        if (radicand == 1) {
            return 1;
        }
        double guess = radicand / 2.0, prevGuess;
        do {
            prevGuess = guess;
            guess = (prevGuess + (radicand / prevGuess)) / 2.0;
        } while (prevGuess != guess);
        return (int)guess;
    }
}


// Uses Newton's method to calculate square root.
// See https://en.wikipedia.org/wiki/Newton's_method for more details.