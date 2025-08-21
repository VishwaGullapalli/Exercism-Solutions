class MicroBlog {
    public String truncate(String input) {
        StringBuilder output = new StringBuilder();
        int length = 0;
        for (int i = 0; i < input.length(); i++) {
            if (length == 5) {
                break;
            } 
            if (Character.isHighSurrogate(input.charAt(i))) {
                output.append(input.charAt(i));
                i++;
                output.append(input.charAt(i));
                length++;
            } else {
                output.append(input.charAt(i));
                length++;
            }
        }
        return output.toString();
    }
}
