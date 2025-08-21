class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int number = String.valueOf(numberToCheck).length();
        int dupe = numberToCheck, sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + (int)Math.pow((dupe % 10), number);
            dupe /= 10;
        }
        if (sum == numberToCheck) {
            return true;
        }
        return false;
    }

}
