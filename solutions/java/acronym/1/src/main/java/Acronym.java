class Acronym {

    private static String cleaned;
    
    Acronym(String phrase) {
        cleaned = "";
        String [] array = phrase.trim().replace("-"," ").replaceAll("\\p{Punct}", "").split(" ");
        for (String element: array) {
            if(!element.isEmpty()) {
                cleaned += String.valueOf(element.charAt(0)).toUpperCase();
            }
        }
        System.out.println(array[0]);
    }

    String get() {
        return cleaned;
    }

}
