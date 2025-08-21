class ReverseString {

    String reverse(String inputString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        
        char inputArray[] = inputString.toCharArray();
        int inputLength = inputArray.length, temp = inputLength;
        char reverseArray[] = new char[inputLength];
        for (int i = 0; i < inputLength; i++) {
            reverseArray[temp - 1] = inputArray[i];
            temp = temp - 1;
        }
        return reverseArray.toString();
    }
  
}
