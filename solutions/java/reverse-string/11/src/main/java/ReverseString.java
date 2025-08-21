class ReverseString {

    String reverse(String inputString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        
        char inputArray[] = inputString.toCharArray();
        char reverseArray[] = new char[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            reverseArray[inputArray.length - 1 - i] = inputArray[i];
        }
        return reverseArray.toString();
    }
  
}
