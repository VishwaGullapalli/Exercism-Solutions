class Bob {

    String hey(String input) {
        String updatedInput = input.trim();
        if (updatedInput.equals("")) {
            return "Fine. Be that way!";
        }
        boolean isQuestion = updatedInput.endsWith("?");
        boolean isYelled = updatedInput.matches("^(?=.*[A-Z])[^a-z]*$");
        System.out.println(isYelled);
        if (isQuestion && isYelled) {
            return "Calm down, I know what I'm doing!";
        } else if (!isQuestion && isYelled) {
            return "Whoa, chill out!";
        } else if (isQuestion && !isYelled) {
            return "Sure.";
        } else {
            return "Whatever.";
        }
    }

}