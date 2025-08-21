class ReverseString {

    String reverse(String inputString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        
        char inputArray[] = inputString.toCharArray();
        String reverseString = "";
        for (int i = 0; i < inputArray.length; i++) {
            reverseString = reverseString + inputArray[i];
        }
        return reverseString;
    }
  
}
