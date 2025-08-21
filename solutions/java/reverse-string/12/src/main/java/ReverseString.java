class ReverseString {

    String reverse(String inputString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        
        char inputArray[] = inputString.toCharArray();
        int inputLength = inputArray.length;
        char reverseArray[] = new char[inputLength];
        for (int i = 0; i < inputLength; i++) {
            reverseArray[inputLength - 1 - i] = inputArray[i];
        }
        return reverseArray.toString();
    }
  
}
